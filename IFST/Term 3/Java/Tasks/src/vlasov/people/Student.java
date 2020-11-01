package vlasov.people;

import java.util.ArrayList;

//Task3_1

public class Student {
    private String name;
    private ArrayList<Integer> marks;

    public void copyMarks(ArrayList<Integer> arr) {
        this.marks = new ArrayList<Integer>(arr.size());
        this.marks.addAll(arr);
    }

    double avrgMark() {
        if (marks == null) {
            return 0;
        } else {
            double avrg = 0;
            for (int i = 0; i < marks.size(); i++) {
                avrg += marks.get(i);
            }
            avrg /= marks.size();
            return avrg;
        }
    }
    public String isExcSt() {
        String str = "";
        double avrg = avrgMark();
        str += "Средняя оценка: " + avrg + ", ";
        if (avrg == 5.0) {str += "отличник";} else {str += "не отличник";}
        return str;
    }

    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<Integer>();
    }
    public void addMark(int m) {
        if (m < 2 || m > 5) throw new IllegalArgumentException("Оценка не может быть <2 или >5");
        this.marks.add(m);
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = new ArrayList<Integer>();
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) < 2 || marks.get(i) > 5) throw new IllegalArgumentException("Оценка не может быть <2 или >5");
        }
        this.marks.addAll(marks);
    }

    public String toString() {
        String str = name + ": ";
        if (marks != null) {
            str += marks;
        }
        return str;
    }
}