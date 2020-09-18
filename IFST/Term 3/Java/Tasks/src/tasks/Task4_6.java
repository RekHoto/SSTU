package tasks;

public class Task4_6 {
    public static void main(String[] args) {

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
}
