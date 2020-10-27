package vlasov.geometry;

public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle(Point center, int radius){
        if (radius <= 0) throw new IllegalArgumentException();
        this.center = center;
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
