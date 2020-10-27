package vlasov.geometry;

//Task4_2

public class Line implements ObjectWithLength, PolygonalChains{
    private Point a;
    private Point b;

    public Line(int x1, int y1, int x2, int y2) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
    }
    public Line(Point a, Point b) {
        this.a = new Point(a.x, a.y);
        this.b = new Point(b.x, b.y);
    }

    public Point getA() {return a;}
    public void setA(int x, int y) {this.a = new Point(x, y);}
    public Point getB() {return b;}
    public void setB(int x, int y) {this.b = new Point(x, y);}

    public int getAX(){return a.x;}
    public int getAY(){return a.y;}
    public int getBX(){return b.x;}
    public int getBY(){return b.y;}

    public void setAX(int x){this.a = new Point(x, a.y);}
    public void setAY(int y){this.a = new Point(a.x, y);}
    public void setBX(int x){this.a = new Point(x, b.y);}
    public void setBY(int y){this.a = new Point(b.x, y);}

    public double getLength() {
        double length = Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
        return length;
    }
    public String toString() {
        return a + ", " + b;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return null;
    }
}