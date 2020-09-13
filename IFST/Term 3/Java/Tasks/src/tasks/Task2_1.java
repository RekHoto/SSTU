package tasks;

public class Task2_1 {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1,3), new Point(23,8));
        System.out.println(l1);

        Line l2 = new Line(new Point(5, 10), new Point(25, 10));

        Line l3 = new Line(l1.a, l2.b);
        System.out.println(l3);

        l1.a.x = 4; l2.b.y = 0;
        System.out.println(l3);
        l1.a = new Point(0,0);
        System.out.println(l3);
    }
}

class Line {
    Point a;
    Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + ", " + b;
    }
}