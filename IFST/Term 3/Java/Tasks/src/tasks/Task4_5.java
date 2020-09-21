package tasks;

public class Task4_5 {
    public static void main(String[] args) {
        Name n = new Name("");

        Name n2 = new Name("Александр","Пушкин", "Сергеевич");

        System.out.println(n2);
        Name n3 = new Name("Владимир", "Маяковский");
        System.out.println(n3);
        System.out.println(n);
    }
}

class Name {
    private String fname;
    private String sname;
    private String pat;



    public Name(String fname, String sname, String pat) {
        try {
            if (fname == null || fname == "") throw new IllegalArgumentException("Имя не может быть пустым");
            this.fname = fname;
            this.sname = sname;
            this.pat = pat;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public void setFname(String fname) {
        try {
            if (fname == null || fname == "") throw new IllegalArgumentException("Имя не может быть пустым");
            this.fname = fname;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public void setSname(String sname) {
        try {
            if (sname == null || sname == "") throw new IllegalArgumentException("Фамилия не может быть пустой");
            this.sname = sname;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public void setPat(String pat) {
        try {
            if (pat == null || pat == "") throw new IllegalArgumentException("Отчество не может быть пустым");
            this.pat = pat;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getFname() {
        return fname;
    }
    public String getSname() {
        return sname;
    }
    public String getPat() {
        return pat;
    }

    public Name(String fname) {
        this(fname, null,null);
    }

    public Name(String fname, String sname) {
        this(fname, sname, null);
    }

    public String toString() {
        return ((sname != null ? sname + ' ' : "")
                + (fname != null ? fname + ' ' : "")
                + (pat != null ? pat + ' ' : "")).trim();
    }
}