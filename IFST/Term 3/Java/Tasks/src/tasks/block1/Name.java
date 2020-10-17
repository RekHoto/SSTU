package tasks.block1;

//Task1_4

public class Name {
    public String fname;
    public String sname;
    public String pat;

    public String toString() {
        return ((sname != null ? sname + ' ' : "")
                + (fname != null ? fname + ' ' : "")
                + (pat != null ? pat + ' ' : "")).trim();
    }
}