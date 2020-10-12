package tasks;

public class Task5_2 {
    public static void main(String[] args) {
        Cat c1 = new Cat("Барсик");
        c1.meow();
        c1.meow(3);
    }
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }
    public void meow() {
        System.out.println(name + ": Мяу!");
    }
    public void meow(int n) {
        String str = name + ": ";
        for (int i = 0; i < n; i++) {
            str += i == n - 1 ? "мяу" : "мяу-";
        }
        System.out.println(str);
    }

    public String toString() {
        return "кот: " + name;
    }
}