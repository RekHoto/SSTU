package tasks;

public class Task2_2 {
    public static void main(String[] args) {
        Name n = new Name();
        n.fname = "Клеопатра";

        Name n2 = new Name();
        n2.fname = "Александр"; n2.sname = "Пушкин"; n2.pat = "Сергеевич";

        Name n3 = new Name();
        n3.fname = "Владимир"; n3.sname = "Маяковский";

        HumanWithName h1 = new HumanWithName(n, 152);
        HumanWithName h2 = new HumanWithName(n2, 167);
        HumanWithName h3 = new HumanWithName(n3, 189);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}

class HumanWithName {
    Name name;
    int age;

    public HumanWithName(Name name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " " + (age < 160 ? "маленький человек" : age > 180 ? "большой человек" : "обычный человек");
    }
}