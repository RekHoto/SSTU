package vlasov.math.geometry;

class Rectangle extends Shape /*implements PolygonalChainable*/ {
    private Point origin;
    private int side1;
    private int side2;

    public Rectangle(Point origin, int side1, int side2) {
        if (side1 <= 0 || side2 <= 0) throw new IllegalArgumentException();
        this.origin = origin;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea(){
        return side1 * side2;
    }

//    @Override
//    public PolygonalChain getPolygonalChain() {
//        PolygonalChain res = new PolygonalChain();
//        res.addPoint(origin);
//        res.addPoint(new Point(origin.getX() + side1, origin.getY()));
//        res.addPoint(new Point(origin.getX() + side1, origin.getY() - side2));
//        res.addPoint(new Point(origin.getX(), origin.getY() - side2));
//        return res;
//    }
}
