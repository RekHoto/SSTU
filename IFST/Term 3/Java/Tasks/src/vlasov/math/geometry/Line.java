package vlasov.math.geometry;

//Task4_2

import java.util.Objects;

public class Line implements Lengthable, PolygonalChainable, Cloneable, Moveable {
    private Point<Integer> a;
    private Point<Integer> b;

    public Line(int x1, int y1, int x2, int y2) {
        this.a = new Point<>(x1, y1);
        this.b = new Point<>(x2, y2);
    }

    public Line(Point<Integer> a, Point<Integer> b) {
        
        this.a = new Point<>(a.x, a.y);
        this.b = new Point<>(b.x, b.y);
    }

    public Point getA() {return a;}
    public void setA(int x, int y) {this.a = new Point<>(x, y);}
    public Point getB() {return b;}
    public void setB(int x, int y) {this.b = new Point<>(x, y);}

    public double getLength() {
        double length = Math.sqrt(Math.pow(a.x.doubleValue() - b.x.doubleValue(), 2)
                + Math.pow(a.y.doubleValue() - b.y.doubleValue(), 2));
        return length;
    }
    public String toString() {
        return a + ", " + b;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return new PolygonalChain(a,b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (!Objects.equals(a, line.a)) return false;
        return Objects.equals(b, line.b);
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line)super.clone();
    }

    @Override
    public void move(int x, int y) {
        a.x += x;
        b.x += x;
        a.y += y;
        b.y += y;
    }
}