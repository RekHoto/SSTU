package tasks.block9;

import tasks.block4.Line;
import tasks.block4.Point;
import tasks.block5.BrokenLine;

import java.util.ArrayList;

//Task9_1

public class EnclosedBrokenLine extends BrokenLine {
    public EnclosedBrokenLine(ArrayList<Point> points) {
        super(points);
    }

    public double length() {
        double length = super.length();
        length += Line.findLength(getPoints().get(getPoints().size() - 1), getPoints().get(0));
        return length;
    }
}