package tasks.block2;

import tasks.block1.Point;
//Task2_1
public class Line {
    Point a;
    Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + ", " + b;
    }
}