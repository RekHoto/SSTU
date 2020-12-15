package vlasov.people.students;

import java.util.*;

public class Student<T> implements Comparable<Student<T>> {
    private String name;
    private List<T> marks = new ArrayList<T>();
    private Checker<T> checker;
    private Deque<CtrlZ> commands = new ArrayDeque<>();

    public Student(String name, Checker<T> checker, T... marks) {
        this.name = name;
        this.checker = checker;
        for (T mark : marks)
            if (!checker.isValid(mark)) throw new IllegalArgumentException();
        this.marks.addAll(Arrays.asList(marks));
    }

    public List<T> getMarks() {
        return marks;
    }
    public void setName(String name) {
        String t = this.name;
        commands.push(()->this.name = t);
        this.name = name;
    }

    public void addMarks(T... marks) {
        for (T mark : marks)
            if (!checker.isValid(mark)) throw new IllegalArgumentException();
        this.marks.addAll(Arrays.asList(marks));
        commands.push(()-> {
            for (int i = 0; i < marks.length; i++)
                this.marks.remove(this.marks.size() - 1);
        });

    }

    public void undo() {
        commands.pop().command();
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