package tasks;

import java.util.ArrayList;

public class Task5_7 {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(1,5)); points.add(new Point(2,8));
        points.add(new Point(5,3));

        BrokenLine l1 = new BrokenLine(points);
        System.out.println(l1.length());

        l1.addPoint(new Point(5,15));
        l1.addPoint(new Point(8, 10));
        System.out.println(l1.length());
    }
}

class BrokenLine {
    ArrayList<Point> points;

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
    double length() {
        if (points.size() < 2) return 0;
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += Line.findLength(points.get(i-1), points.get(i));
        }
        return length;
    }
}