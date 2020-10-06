package tasks;

public class Task5_8 {
    public static void main(String[] args) {
        Square5_8 s1 = new Square5_8(5, 3, 24);
        BrokenLine l1 = s1.toBL();
        System.out.println(l1.length());
        l1.points.set(l1.points.size() - 1, new Point(5, 10));
        System.out.println(l1.length());
    }
}

class Square5_8 {
    private Point origin;
    private int side;

    public Square5_8(Point origin, int side) {
        if (side < 0) throw new IllegalArgumentException("Сторона не может быть меньше 0");
        this.origin = origin;
        this.side = side;
    }
    Square5_8(int x, int y, int side) {
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
