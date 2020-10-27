package vlasov.other;

//Task3_2

public class RecordBook {
    long id;
    String studentName;
    Discipline[] res;

    public void copyRes(Discipline[] arr) {
        this.res = new Discipline[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.res[i] = new Discipline(arr[i]);
        }
    }

    public String toString() {
        String str = studentName + ", №" + id + ":\n";
        for (int i = 0; i < res.length; i++) {
            str += "    " + res[i] + "\n";
        }
        return str;
    }
}
class Discipline {
    String name;
    String teacher;
    int mark;

    public Discipline(Discipline d) {
        this.name = d.name;
        this.teacher = d.teacher;
        this.mark = d.mark;
    }

    public Discipline(String name, String teacher, int mark) {
        this.name = name;
        this.teacher = teacher;
        this.mark = mark;
    }

    public String toString() {
        return name + ", " + teacher + ", " + mark;
    }
}