package vlasov.birds;

import java.util.concurrent.ThreadLocalRandom;

public class Parrot extends Bird {
    private String text;

    public Parrot(String text) {this.text = text;}

    @Override
    public void sing() {
        StringBuilder str = new StringBuilder(text);
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1,text.length()/10); i++) {
            int a = ThreadLocalRandom.current().nextInt(0,text.length());
            int b = ThreadLocalRandom.current().nextInt(0,text.length());
            char t = str.charAt(a);
            str.setCharAt(a, str.charAt(b));
            str.setCharAt(b, t);
        }
        System.out.println(str);
    }
}
