package tasks;

public class Task6_1__6_12 {
    public static void main(String[] args) {
        // Task6_1
        try {
            House h1 = new House(-1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        // see Task4_3


        // Task6_2
        try {
            Time t1 = new Time(-1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        Time t2 = new Time(100000);
        System.out.println(t2);
        // see Task


        // Task6_3
        try {
            Square s1 = new Square(2,3,-1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        Square s2 = new Square(2,3,1);
        try {
            s2.setSide(-1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        // see Task5_8

        // Task6_4
        // see Task5_5

        // Task 6_5
        Pistol g1 = new Pistol(7);
        g1.reload(3);
        for (int i = 0; i < 5; i++) {
            g1.shoot();
        }
        g1.reload(8);
        g1.shoot(); g1.shoot();
        g1.unload(); g1.shoot();
        // see Task5_1

        // Task6_6
        // see Task4_2

        // Task6_7
        Name n1 = new Name("Александр");
        n1.setSname(""); n1.setSname("Пушкин");
        Name n2 = new Name("");
        System.out.println(n1);
        // see Task4_5

        // Task6_8
        // see Task4_6

        // Task6_9
        // see Task3_1

        // Task6_10
        // see Task3_5, Task2_5

        // Task6_11
        // see Task3_4

        // Task6_12
        // see Task2_4
    }
}
//Task4_3