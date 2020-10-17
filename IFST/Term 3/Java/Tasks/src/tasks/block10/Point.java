package tasks.block10;

public class Point {
    private Integer x;
    private Integer y;
    private Integer z;

    public Point(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(Integer x, Integer y) {
        this(x, y, null);
    }
    public Point(Integer x) {
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

class PointWithTime extends Point {
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