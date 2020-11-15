import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WordStatIndex {
    public static void main(String[] args) {
        wordStat(args);
    }
    public static void wordStat(String[] s) {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File(s[0])), "UTF-8"));
            try {
                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(s[1])), "UTF-8"));
                try {
                    List<String> res = new ArrayList<>();
                    List<List<Integer>> ints = new ArrayList<>();
                    int wordInd = 0;
                    while (true) {
                        String line = r.readLine();
                        if (line == null) break;
                        int t = 0;
                        for (int i = 0; i < line.length(); i++) {
                            boolean cond = Character.isLetter(line.charAt(i)) || line.charAt(i) == '\'' || Character.getType(line.charAt(i)) == Character.DASH_PUNCTUATION;
                            if (!cond || i == line.length() - 1) {
                                if (i - t == 0) {
                                    t = i + 1;
                                    continue;
                                }
                                String sub = line.substring(t, i == line.length() - 1 && cond ? i + 1 : i).toLowerCase();
                                wordInd++;
                                if (res.contains(sub)) {
                                    int pos = res.indexOf(sub);
                                    ints.get(pos).set(0, ints.get(pos).get(0) + 1);
                                    ints.get(pos).add(wordInd);
                                } else {
                                    res.add(sub);
                                    List<Integer> arr = new ArrayList<>();
                                    arr.add(1);
                                    arr.add(wordInd);
                                    ints.add(arr);
                                }
                                t = i + 1;
                            }
                        }
                    }
                    for (int i = 0; i < res.size(); i++) {
                        w.write(res.get(i));
                        for (int j = 0; j < ints.get(i).size(); j++) {
                            w.write(" " + ints.get(i).get(j));
                        }
                        w.write("\n");
                    }

                } finally {
                    w.close();
                }
            } finally {
                r.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found");
        } catch (IOException e) {
            System.out.println("Input file error");
        }

    }
}
