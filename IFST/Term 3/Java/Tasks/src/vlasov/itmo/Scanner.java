package vlasov.itmo;

import java.io.*;
import java.nio.CharBuffer;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Scanner {
    private CharBuffer buf;
    private Reader reader;
    private int pos;
    private int savedPos = -1;
    private int hasNextPos = -1;
    private String hasNextRes = null;
    private boolean hasNextResInt = false;

    ///////////////////////////////////////////////////

    public Scanner(String s) {
        this(s, 512);
    }

    public Scanner(Reader r) {
        this(r, 512);
    }

    public Scanner(InputStream s) {
        this(s, 512);
    }

    public Scanner(String s, int len) {
        this(new ByteArrayInputStream(s.getBytes()), len);
    }

    public Scanner(Reader r, int len) {
        reader = r;
        buf = CharBuffer.allocate(len);
        buf.limit(0);
    }

    public Scanner(InputStream in, int len) {
        reader = new InputStreamReader(in);
        buf = CharBuffer.allocate(len);
        buf.limit(0);
    }

    ///////////////////////////////////////////////////

    public boolean hasNext() {
        if (hasNextPos != -1) {
            return true;
        }
        saveState();
        while (buf.position() != buf.limit() || readInput()) {
            if (findFirstWord()) {
                revertState();
                buf.position(pos);
                savedPos = -1;
                return true;
            }
        }
        revertState();
        buf.position(pos);
        savedPos = -1;
        return false;
    }

    public boolean hasNextInt() {
        return hasNext() && hasNextResInt;
    }

    public boolean hasNextLine() {
        return hasNext() || (buf.limit() != buf.position());
    }

    public String nextLine() {
        StringBuilder sb = new StringBuilder();
        while (pos != buf.limit() || readInput()) {
            char c = buf.get();
            pos++;
            sb.append(c);
            if (c == '\n') {
                break;
            }
        }
        clearCache();
        return sb.toString();
    }

    public int nextInt() {
        if (hasNextPos == -1) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
        }
        if (!hasNextResInt) {
            throw new InputMismatchException();
        }
        int nextInteger = Integer.parseInt(hasNextRes);
        skipBufferToFirstWord();
        clearCache();
        return nextInteger;
    }

    public void close() throws IOException {
        reader.close();
    }

    ///////////////////////////////////////////////////

    private boolean findFirstWord() {
        if (hasNextPos != -1) {
            return true;
        }
        while (buf.position() != buf.limit() || readInput()) {
            char c = buf.get();
            if (!Character.isWhitespace(c)) {
                StringBuilder sb = new StringBuilder();
                buf.position(buf.position() - 1);
                while (!Character.isWhitespace(c) && (buf.position() != buf.limit() || readInput())) {
                    if (!Character.isWhitespace(c = buf.get())) {
                        sb.append(c);
                    }
                }
                hasNextPos = buf.position();
                hasNextRes = sb.toString();
                hasNextResInt = isInt(hasNextRes);
                return true;
            }
        }
        return false;
    }

    private String next() {
        if (hasNextPos == -1) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
        }
        String nextWord = hasNextRes;
        skipBufferToFirstWord();
        clearCache();
        return nextWord;
    }

    private void saveState() {
        savedPos = buf.position();
    }

    private void revertState() {
        pos = savedPos;
    }

    private void skipBufferToFirstWord() {
        buf.position(pos = hasNextPos);
    }

    private boolean isInt(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    private void decreaseSavedIndex(int offset) {
        if (savedPos != -1) {
            savedPos -= offset;
        }
        pos -= offset;
    }

    private void makeSpace() {
        int offset = ((savedPos == -1) ? pos : savedPos);
        int p = buf.position() - offset;
        buf.position(offset);
        if (offset > 0) {
            buf.compact();
            decreaseSavedIndex(offset);
            buf.flip();
            buf.position(p);
            return;
        }
        CharBuffer newBuffer = CharBuffer.allocate(2 * buf.capacity());
        newBuffer.put(buf);
        newBuffer.flip();
        buf = newBuffer;
        buf.position(p);
    }

    private boolean readInput() {
        if (buf.limit() == buf.capacity()) {
            makeSpace();
        }
        int p = buf.position();
        buf.position(buf.limit());
        buf.limit(buf.capacity());

        int n;
        try {
            n = reader.read(buf);
        } catch (IOException e) {
            n = -1;
        }
        buf.limit(buf.position());
        buf.position(p);
        return n > 0;
    }

    private void clearCache() {
        hasNextRes = null;
        hasNextPos = -1;
        hasNextResInt = false;
    }
}
