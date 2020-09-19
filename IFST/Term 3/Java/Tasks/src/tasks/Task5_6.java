package tasks;

public class Task5_6 {
    public static void main(String[] args) {
        Student s1 = new Student("Вася", new int[]{3,4,3,5});
        Student s2 = new Student("Петя", new int[]{5,5,5,5});

        System.out.println(s1.isExcSt());
        System.out.println(s2.isExcSt());
    }
}

//Task 4_7