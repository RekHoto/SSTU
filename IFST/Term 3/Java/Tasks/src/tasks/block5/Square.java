package tasks.block5;
import tasks.block4.Point;

//Task5_8

public class Square {
    private Point origin;
    private int side;

    public Square(Point origin, int side) {
        if (side < 0) throw new IllegalArgumentException("Сторона не может быть меньше 0");
        this.origin = origin;
        this.side = side;
    }
    public Square(int x, int y, int side) {
        this(new Point(x, y), side);
    }

    public void setSide(int side) {
        if (side < 0) throw new IllegalArgumentException("Сторона не может быть меньше 0");
        this.side = side;
    }

    BrokenLine toBL() {
        BrokenLine res = new BrokenLine(); //Task5_7
        res.addPoint(origin);
        res.addPoint(new Point(origin.getX() + side, origin.getY()));
        res.addPoint(new Point(origin.getX() + side, origin.getY() + side));
        res.addPoint(new Point(origin.getX(), origin.getY() + side));
        res.addPoint(new Point(origin.getX(), origin.getY()));
        return res;
    }

    public String toString() {
        return "Квадрат в точке " + origin + ", со стороной " + side;
    }
}
