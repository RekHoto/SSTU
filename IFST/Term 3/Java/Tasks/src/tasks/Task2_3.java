package tasks;

public class Task2_3 {
    public static void main(String[] args) {
        Name1_4 n1 = new Name1_4();
        Name1_4 n2 = new Name1_4();
        Name1_4 n3 = new Name1_4();

        n1.fname = "Иван"; n1.sname = "Чудов";
        n2.fname = "Петр"; n2.sname = "Чудов";
        n3.fname = "Борис";

        HumanWithDad h1 = new HumanWithDad();
        HumanWithDad h2 = new HumanWithDad();
        HumanWithDad h3 = new HumanWithDad();

        h1.name = n1; h2.name = n2; h3.name = n3;
        h2.dad = h1; h3.dad = h2;

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}

class HumanWithDad {
    Name1_4 name;
    int age;
    HumanWithDad dad;

    public String toString() {
        if (dad != null) {
            if (name.sname == null && dad.name.sname != null) name.sname = dad.name.sname;
            if (name.pat == null && dad.name.fname != null) name.pat = dad.name.fname + "ович";
        }
        return name + "";
    }
}