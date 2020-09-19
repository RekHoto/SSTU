package tasks;

public class Task4_2 {
    public static void main(String[] args) {
        Line l1 = new Line(new Point1_1(1,3), new Point1_1(23,8));
        System.out.println(l1);

        Line l2 = new Line(new Point1_1(5, 10), new Point1_1(25, 10));

        Line l3 = new Line(l1.a, l2.b);
        System.out.println(l3);

        l1.a.x = 4; l2.b.y = 0;
        System.out.println(l3);
        l1.a = new Point1_1(0,0);
        System.out.println(l3);

    }
}

class Line {
    Point1_1 a;
    Point1_1 b;
    public Line(int x1, int y1, int x2, int y2) {
        this.a = new Point1_1(x1, y1);
        this.b = new Point1_1(x2, y2);
    }
    public Line(Point1_1 a, Point1_1 b) {
        this.a = a;
        this.b = b;
    }
    public int findLength() {
        double length = Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
        return (int)length;
    }
    public static double findLength(Point a, Point b) {
        double length = Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
        return length;
    }
    public String toString() {
        return a + ", " + b;
    }
}