package tasks;

public class Task4_5 {
    public static void main(String[] args) {
        Name n = new Name("Клеопатра");
        System.out.println(n);
        Name n2 = new Name("Александр","Пушкин", "Сергеевич");

        System.out.println(n2);
        Name n3 = new Name("Владимир", "Маяковский");
        System.out.println(n3);
    }
}

class Name {
    String fname;
    String sname;
    String pat;

    public Name(String fname) {
        this.fname = fname;
    }

    public Name(String fname, String sname) {
        this.fname = fname;
        this.sname = sname;
    }

    public Name(String fname, String sname, String pat) {
        this.fname = fname;
        this.sname = sname;
        this.pat = pat;
    }

    public String toString() {
        return ((sname != null ? sname + ' ' : "")
                + (fname != null ? fname + ' ' : "")
                + (pat != null ? pat + ' ' : "")).trim();
    }
}