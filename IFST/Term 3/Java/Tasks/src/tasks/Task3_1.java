package tasks;

public class Task3_1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Вася"; s1.marks = new int[]{3, 4, 5};
        System.out.println(s1);

        Student s2 = new Student();
        s2.name = "Петя"; s2.marks = s1.marks;
        s1.marks[0] = 5;
        System.out.println(s2);

        Student s3 = new Student();
        s3.name = "Андрей"; s3.copyMarks(s1.marks);
        s1.marks[1] = 1;
        System.out.println(s3);
    }
}

class Student {
    String name;
    int[] marks;

    public void copyMarks(int[] arr) {
        this.marks = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.marks[i] = arr[i];
        }
    }

    double avrgMark() {
        if (marks == null) {
            return 0;
        } else {
            double avrg = 0;
            for (int i = 0; i < marks.length; i++) {
                avrg += marks[i];
            }
            avrg /= marks.length;
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

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    Student(String name) {
        this(name, null);
    }
    Student(){};
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String toString() {
        String str = name + ": ";
        if (marks != null) {
            for (int i = 0; i < marks.length; i++) {
                if (i != marks.length - 1) {
                    str += marks[i] + ", ";
                } else {
                    str += marks[i] + ".";
                }
            }
        }
        return str;
    }
}