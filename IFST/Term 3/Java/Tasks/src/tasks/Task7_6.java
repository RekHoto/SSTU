package tasks;
import java.util.concurrent.ThreadLocalRandom;


public class Task7_6 {
    public static void main(String[] args) {
        Secret s1 = new Secret("текст секрета у нового хранителя должен представлять собой копию текста предыдущего хранителя, " +
                "но с добавлением Х случайных символов в Х случайных мест, где Х — это число в диапазоне от 0 до N," +
                " а N в свою очередь это 10% от размера исходного текста.","Вася");
        Secret s2 = new Secret(s1,"Петя");
        Secret s3 = new Secret(s2, "Who");
        Secret s4 = new Secret(s3, "Kto");
        System.out.println(s3.nName(-3));
        System.out.println(s2.nName(1));
        String str = "aaaa";

    }
}

class Secret {
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