package tasks;

public class Task1_3 {
    public static void main(String[] args) {
        Human1_6 n = new Human1_6("Клеопатра", 152);
        Human1_6 n2 = new Human1_6("Пушкин", 167);
        Human1_6 n3 = new Human1_6("Владимир", 189);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}

class Human1_6 {
    String name;
    int age;

    public Human1_6(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + ' ' + (age < 160 ? "маленький человек" : age > 180 ? "большой человек" : "обычный человек");
    }
}