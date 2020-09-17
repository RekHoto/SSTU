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

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String toString() {
        String str = name + ": ";
        for (int i = 0; i < marks.length; i++) {
            if (i != marks.length - 1) {
                str += marks[i] + ", ";
            } else {
                str += marks[i] + ".";
            }
        }
        return str;
    }
}