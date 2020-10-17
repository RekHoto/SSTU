package tasks.block5;

import tasks.block4.Line;
import tasks.block4.Point;

import java.util.ArrayList;

//Task5_7

public class BrokenLine {
    private ArrayList<Point> points;

    public BrokenLine(ArrayList<Point> points) {
        this.points = points;
    }
    BrokenLine(){this(new ArrayList<Point>());}

    void addPoint(Point p) {
        this.points.add(p);
    }
    void addPoints(ArrayList<Point> arr) {
        points.addAll(arr);
    }
    public ArrayList<Point> getPoints() {
        return points;
    }

    public double length() {
        if (points.size() < 2) return 0;
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += Line.findLength(points.get(i-1), points.get(i));
        }
        return length;
    }
}