public class Task1_4 {
    public static void main(String[] args) {
        Name n = new Name();
        n.name = "Клеопатра";
        System.out.println(n);
        Name n2 = new Name();
        n2.name = "Александр"; n2.sname = "Пушкин"; n2.pat = "Сергеевич";
        System.out.println(n2);
        Name n3 = new Name();
        n3.name = "Владимир"; n3.sname = "Маяковский";
        System.out.println(n3);
    }
}

class Name {
    String name;
    String sname;
    String pat;

    public String toString() {
        return ((sname != null ? sname + ' ' : "")
                + (name != null ? name + ' ' : "")
                + (pat != null ? pat + ' ' : "")).trim();
    }
}