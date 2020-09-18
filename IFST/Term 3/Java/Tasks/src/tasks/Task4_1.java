package tasks;

public class Task4_1 {
    public static void main(String[] args) {
        Point n = new Point(3, 5);
        Point n2 = new Point(25, 6);
        Point n3 = new Point(7, 8);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
