package vlasov.geometry;

public class Square extends Shape implements PolygonalChains {
    private Point origin;
    private int side;

    public Square(Point origin, int side) {
        if (side <= 0) throw new IllegalArgumentException();
        this.origin = origin;
        this.side = side;
    }

    public Square(int x, int y, int side) {
        if (side <= 0) throw new IllegalArgumentException();
        this.origin = new Point(x, y);
        this.side = side;
    }

    public void setSide(int side) {
       this.side = side;
    }

    public int getSide() {
        return side;
    }

    public PolygonalChain getPolygonalChain() {
        PolygonalChain res = new EnclosedPolygonalChain();
        res.addPoint(origin);
        res.addPoint(new Point(origin.getX() + side, origin.getY()));
        res.addPoint(new Point(origin.getX() + side, origin.getY() - side));
        res.addPoint(new Point(origin.getX(), origin.getY() - side));
        return res;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
