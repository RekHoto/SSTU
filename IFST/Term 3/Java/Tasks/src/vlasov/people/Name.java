package vlasov.people;

//Task4_5

public class Name {
    private String fname;
    private String sname;
    private String pat;

    private Name(String fname, String sname, String pat) {
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

    public static NameBuildable getBuilder() {
        return new NameBuilder();
    }

    static class NameBuilder implements NameBuildable {
        private String fname;
        private String sname;
        private String pat;

        public NameBuilder setFname(String fname) {
            this.fname = fname;
            return this;
        }
        public NameBuilder setSname(String sname) {
            this.sname = sname;
            return this;
        }
        public NameBuilder setPat(String pat) {
            this.pat = pat;
            return this;
        }
        public Name getName() {
            return new Name(this.fname, this.sname, this.pat);
        }
    }
    public String toString() {
        return ((sname != null ? sname + ' ' : "")
                + (fname != null ? fname + ' ' : "")
                + (pat != null ? pat + ' ' : "")).trim();
    }
}

