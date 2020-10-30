package vlasov.geometry;

class Triangle extends Shape implements PolygonalChainable {
    private Point point1;
    private Point point2;
    private Point point3;
    private double a;
    private double b;
    private double c;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        a = new Line(point1, point2).getLength();
        b = new Line(point2, point3).getLength();
        c = new Line(point3, point1).getLength();
    }

    public double getArea() {
        double halfP = (a + b + c) / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        PolygonalChain res = new PolygonalChain();
        res.addPoint(point1);
        res.addPoint(point2);
        res.addPoint(point3);
        return res;
    }
}
