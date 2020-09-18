package tasks;

public class Task1_1 {
    public static void main(String[] args) {
        Point1_1 n = new Point1_1(1, -2);
        Point1_1 n2 = new Point1_1(4, 5);
        Point1_1 n3 = new Point1_1(10, -7);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}
class Point1_1 {
    int x;
    int y;

    public Point1_1(int x, int y) {
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
