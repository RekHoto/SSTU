package tasks;

public class Task2_1 {
    public static void main(String[] args) {
        Line2_1 l1 = new Line2_1(new Point1_1(1,3), new Point1_1(23,8));
        System.out.println(l1);

        Line2_1 l2 = new Line2_1(new Point1_1(5, 10), new Point1_1(25, 10));

        Line2_1 l3 = new Line2_1(l1.a, l2.b);
        System.out.println(l3);

        l1.a.x = 4; l2.b.y = 0;
        System.out.println(l3);
        l1.a = new Point1_1(0,0);
        System.out.println(l3);

    }
}

class Line2_1 {
    Point1_1 a;
    Point1_1 b;

    public Line2_1(Point1_1 a, Point1_1 b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + ", " + b;
    }
}