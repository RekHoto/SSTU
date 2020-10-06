package tasks;

import java.util.ArrayList;

public class Task10_4 {
    public static void main(String[] args) {

    }
}

abstract class Shape {
    abstract double getArea();
}
class Circle extends Shape {
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

class Square extends Shape {
    private Point origin;
    private int side;

    public Square(Point origin, int side) {
        if (side <= 0) throw new IllegalArgumentException();
        this.origin = origin;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
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
}

class Triangle extends Shape {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double getArea() {
        ArrayList<Point> arr = new ArrayList<Poi>()
        EnclosedBrokenLine l = new EnclosedBrokenLine();
        double perimeter =
    }
}