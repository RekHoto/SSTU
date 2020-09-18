package tasks;

public class Task1_4 {
    public static void main(String[] args) {
        Name1_4 n = new Name1_4();
        n.fname = "Клеопатра";
        System.out.println(n);
        Name1_4 n2 = new Name1_4();
        n2.fname = "Александр"; n2.sname = "Пушкин"; n2.pat = "Сергеевич";
        System.out.println(n2);
        Name1_4 n3 = new Name1_4();
        n3.fname = "Владимир"; n3.sname = "Маяковский";
        System.out.println(n3);
    }
}

class Name1_4 {
    String fname;
    String sname;
    String pat;

    public String toString() {
        return ((sname != null ? sname + ' ' : "")
                + (fname != null ? fname + ' ' : "")
                + (pat != null ? pat + ' ' : "")).trim();
    }
}