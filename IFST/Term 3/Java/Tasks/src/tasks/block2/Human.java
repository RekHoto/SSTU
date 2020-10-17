package tasks.block2;

import tasks.block1.Name;

//Task2_2

public class Human {
    Name name;
    int age;

    public Human(Name name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " " + (age < 160 ? "маленький человек" : age > 180 ? "большой человек" : "обычный человек");
    }
}