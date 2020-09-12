public class Task1_3 {
    public static void main(String[] args) {
        Human n = new Human("Клеопатра", 152);
        Human n2 = new Human("Пушкин", 167);
        Human n3 = new Human("Владимир", 189);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return this.name + ' ' + (this.age < 160 ? "маленький человек" : this.age > 180 ? "большой человек" : "обычный человек");
    }
}