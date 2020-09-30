package tasks;

import java.util.ArrayList;

public class Task9_1 {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(0,0)); points.add(new Point(3,0));
        points.add(new Point(3,4));

        BrokenLine l1 = new BrokenLine(points);
        System.out.println(l1.length());

        EnclosedBrokenLine l2 = new EnclosedBrokenLine(points);
        System.out.println(l2.length());
    }
}

class EnclosedBrokenLine extends BrokenLine {
    public EnclosedBrokenLine(ArrayList<Point> points) {
        super(points);
    }

    public double length() {
        double length = super.length();
        length += Line.findLength(points.get(points.size() - 1), points.get(0));
        return length;
    }
}