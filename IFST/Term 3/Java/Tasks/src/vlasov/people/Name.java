package vlasov.people;

//Task4_5

public class Name {
    private String fname;
    private String sname;
    private String pat;

    public Name(String fname, String sname, String pat) {
        if (fname == null || fname == "") throw new IllegalArgumentException("Имя не может быть пустым");
        this.fname = fname;
        this.sname = sname;
        this.pat = pat;
    }
    public void setFname(String fname) {
        if (fname == null || fname == "") throw new IllegalArgumentException("Имя не может быть пустым");
        this.fname = fname;
    }
    public void setSname(String sname) {
        if (sname == null || sname == "") throw new IllegalArgumentException("Фамилия не может быть пустой");
        this.sname = sname;
    }
    public void setPat(String pat) {
        if (pat == null || pat == "") throw new IllegalArgumentException("Отчество не может быть пустым");
        this.pat = pat;
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