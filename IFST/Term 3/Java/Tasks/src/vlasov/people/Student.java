package vlasov.people;

import java.util.ArrayList;
import java.util.Arrays;

public class Student<T> implements Comparable<Student<T>> {
    private String name;
    private ArrayList<T> marks;
    private Checker<T> checker;

    public void copyMarks(ArrayList<T> arr) {
        this.marks = new ArrayList<T>(arr.size());
        this.marks.addAll(arr);
    }

    public ArrayList<T> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<T> marks) {
        this.marks = marks;
    }

    public Student(String name, Checker<T> checker, T... marks) {
        this.name = name;
        for (T mark : marks)
            if (!checker.isValid(mark)) throw new IllegalArgumentException();
        this.marks = new ArrayList<T>();
        this.marks.addAll(Arrays.asList(marks));
    }
    public void addMark(T mark) {
        if (!checker.isValid(mark)) throw new IllegalArgumentException();
        this.marks.add(mark);
    }


    public String toString() {
        String str = name + ": ";
        if (marks != null) {
            str += marks;
        }
        return str;
    }

    public int compareTo(Student<T> student) {
        int res = this.marks.size() - student.marks.size();
        return Integer.compare(0, res);
    }

}