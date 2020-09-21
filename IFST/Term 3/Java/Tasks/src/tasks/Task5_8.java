package tasks;

import java.util.ArrayList;

public class Task5_8 {
    public static void main(String[] args) {
        Square s1 = new Square(5, 3, 24);
        BrokenLine l1 = s1.toBL();
        System.out.println(l1.length());
        l1.points.set(l1.points.size() - 1, new Point(5, 10));
        System.out.println(l1.length());
    }
}

class Square {
    private Point origin;
    private int side;

    public Square(Point origin, int side) {
        if (side < 0) throw new IllegalArgumentException("Сторона не может быть меньше 0");
        this.origin = origin;
        this.side = side;
    }
    Square(int x, int y, int side) {
        this(new Point(x, y), side);
    }

    public void setSide(int side) {
        if (side < 0) throw new IllegalArgumentException("Сторона не может быть меньше 0");
        this.side = side;
    }

    BrokenLine toBL() {
        BrokenLine res = new BrokenLine(); //Task5_7
        res.addPoint(origin);
        res.addPoint(new Point(origin.x + side, origin.y));
        res.addPoint(new Point(origin.x + side, origin.y + side));
        res.addPoint(new Point(origin.x, origin.y + side));
        res.addPoint(new Point(origin.x, origin.y));
        return res;
    }

    public String toString() {
        return "Квадрат в точке " + origin + ", со стороной " + side;
    }
}
