package tasks;

public class Task1_1 {
    public static void main(String[] args) {
        Point n = new Point(1, -2);
        Point n2 = new Point(4, 5);
        Point n3 = new Point(10, -7);
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
