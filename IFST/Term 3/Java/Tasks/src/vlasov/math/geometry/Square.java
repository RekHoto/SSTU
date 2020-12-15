package vlasov.math.geometry;

public class Square extends Shape /*implements PolygonalChainable*/ {
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

//    public PolygonalChain getPolygonalChain() {
//        return new EnclosedPolygonalChain(new ArrayList<>(Arrays.asList(origin,
//                new Point(origin.getX() + side, origin.getY()),
//                new Point(origin.getX() + side, origin.getY() - side),
//                new Point(origin.getX(), origin.getY() - side))));
//    }
    @Override
    public double getArea() {
        return side * side;
    }
}
