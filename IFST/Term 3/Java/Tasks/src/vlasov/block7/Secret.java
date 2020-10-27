package vlasov.block7;
import java.util.concurrent.ThreadLocalRandom;


public class Secret {
    private String text;
    private String name;
    private Secret prev;
    private Secret next;
    int curr = 0;

    // Constructors
    public Secret(String text, String name) {
        this.text = text;
        this.name = name;
    }
    public Secret(Secret secret, String name) {
        if (secret.next != null) throw new IllegalArgumentException("Секрет уже кому-то рассказан");
        this.text = textTransform(secret.text);
        this.name = name;
        this.curr = secret.curr + 1;
        secret.next = this;
        this.prev = secret;
        System.out.println(secret.name + " рассказал, что " + secret.text);
    }

    public static String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private char randChar() {
        return alphabet.charAt(ThreadLocalRandom.current().nextInt(0, 66));
    }
    private String textTransform(String text) {
        String newText = text;
        int index;
        int x = ThreadLocalRandom.current().nextInt(0, text.length() / 10);
        for (int i = 0; i < x; i++) {
            index = ThreadLocalRandom.current().nextInt(0, text.length());
            newText = newText.substring(0, index) + randChar() + newText.substring(index + 1, newText.length());
        }
        return newText;
    }


    public int getQueueNum() {
        return curr;
    }

    public String nName(int n) {
        Secret curr = this;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                if (curr.next == null) return "Нет такого";
                curr = curr.next;
            }
        } else {
            for (int i = 0; i < -n; i++) {
                if (curr.prev == null) return "Нет такого";
                curr = curr.prev;
            }
        }
        return curr.name;
    }

    public String toString() {
        return name + ": это секрет!";
    }
}