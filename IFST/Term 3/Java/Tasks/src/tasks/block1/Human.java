package tasks.block1;

//Task1_3

public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + ' ' + (age < 160 ? "маленький человек" : age > 180 ? "большой человек" : "обычный человек");
    }
}