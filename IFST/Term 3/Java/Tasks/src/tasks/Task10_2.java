package tasks;

import java.util.concurrent.ThreadLocalRandom;

public class Task10_2 {
    public static void main(String[] args) {
        Sparrow b1 = new Sparrow();
        b1.sing();
        Cuckoo b2 = new Cuckoo();
        b2.sing();
        Parrot b3 = new Parrot("чтото я ничего не понял");
        b3.sing();
    }
}

abstract class Bird {
    public abstract void sing();
}
class Sparrow extends Bird {

    @Override
    public void sing() {
        System.out.println("чырык");
    }
}

class Cuckoo extends Bird {

    @Override
    public void sing() {
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1,10); i++) System.out.println("ку-ку");
    }
}

class Parrot extends Bird {
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