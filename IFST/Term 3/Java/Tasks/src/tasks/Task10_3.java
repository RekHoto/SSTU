package tasks;

public class Task10_3 {
    public static void main(String[] args) {
        Point10_3 p1 = new Point10_3(1,2);
        PointWithTime p2 = new PointWithTime(1, 3, 6);
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Point10_3 {
    private Integer x;
    private Integer y;
    private Integer z;

    public Point10_3(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point10_3(Integer x, Integer y) {
        this(x, y, null);
    }
    public Point10_3(Integer x) {
        this(x, null, null);
    }

    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }
    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }
    public Integer getZ() {
        return z;
    }
    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + x + (y == null ? "" : ", " + y) + (z == null ? "" : ", " + z) + "}";
    }
}

class PointWithTime extends Point10_3 {
    private Integer t;

    public PointWithTime(Integer x, Integer y, Integer z, Integer t) {
        super(x, y, z);
        this.t = t;
    }
    public PointWithTime(Integer x, Integer y, Integer t) {
        super(x, y);
        this.t = t;
    }
    public PointWithTime(Integer x, Integer t) {
        super(x);
        this.t = t;
    }

    public Integer getT() {
        return t;
    }
    public void setT(Integer t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return super.toString() + ", t = " + t;
    }
}