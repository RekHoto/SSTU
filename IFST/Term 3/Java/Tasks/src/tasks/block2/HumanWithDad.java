package tasks.block2;

import tasks.block1.Name;
//Task2_3
public class HumanWithDad {
    Name name;
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