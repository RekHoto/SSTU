package tasks.block10;

import tasks.block4.Line;
import tasks.block4.Point;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(new Point(0, 0), new Point(3, 0), new Point(3, 4));
        System.out.println(t1.getArea());
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
    private double a;
    private double b;
    private double c;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        a = Line.findLength(point1, point2);
        b = Line.findLength(point2, point3);
        c = Line.findLength(point3, point1);
    }

    public double getArea() {
        double halfP = (a + b + c) / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }
}