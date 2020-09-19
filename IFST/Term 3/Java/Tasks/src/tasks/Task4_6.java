package tasks;

public class Task4_6 {
    public static void main(String[] args) {
        Human h1 = new Human("Лев", 170);
        Human h2 = new Human(new Name("Сергей", "Пушкин"), 168, h1);
        Human h3 = new Human("Александр", 167, h2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

    }
}

class Human {
    Name name;
    int age;
    Human dad;

    public Human(Name name, int age, Human dad) {
        this.name = name;
        this.age = age;
        this.dad = dad;
        if (dad != null) {
            if (name.sname == null && dad.name.sname != null) {
                name.sname = dad.name.sname;
            }
            if (name.pat == null) {
                name.pat = dad.name.fname + "ович";
            }
        }
    }
    Human(String fname, int age) {
        this(new Name(fname), age, null);
    }
    Human(String fname, int age, Human dad) {
        this(new Name(fname, dad.name.sname, dad.name.fname + "ович"), age, dad);
    }
    Human(Name name, int age) {
        this(name, age, null);
    }

    public String toString() {
        return name + ", " + age;
    }
}
