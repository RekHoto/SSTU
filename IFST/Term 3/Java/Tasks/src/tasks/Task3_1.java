package tasks;

import java.util.ArrayList;

public class Task3_1 {
    public static void main(String[] args) {
        Student s1 = new Student("Вася");

        System.out.println(s1);

        Student s2 = new Student("Петя");

        System.out.println(s2);

        Student s3 = new Student("Андрей");

        System.out.println(s3);
    }
}

class Student {
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
    String isExcSt() {
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
        try {
            if (m < 2 || m > 5) throw new IllegalArgumentException("Оценка не может быть <2 или >5");
            this.marks.add(m);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }

    public void setMarks(ArrayList<Integer> marks) {
        try {
            this.marks = new ArrayList<Integer>();
            for (int i = 0; i < marks.size(); i++) {
                if (marks.get(i) < 2 || marks.get(i) > 5) throw new IllegalArgumentException("Оценка не может быть <2 или >5");
            }
            this.marks.addAll(marks);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        String str = name + ": ";
        if (marks != null) {
            str += marks;
        }
        return str;
    }
}