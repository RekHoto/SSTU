package vlasov.geometry;

import java.util.ArrayList;
import java.util.List;

//Task5_7

public class PolygonalChain implements ObjectWithLength, PolygonalChains {
    List<Point> points;

    public PolygonalChain(List<Point> points) {
        this.points = points;
    }
    public PolygonalChain(){this(new ArrayList<Point>());}
    public PolygonalChain(Point... points) {
        this.points = new ArrayList<>();
        for (Point p:points) addPoint(p);
    }

    public void addPoint(Point p) {
        this.points.add(p);
    }
    public void addPoints(List<Point> arr) {
        points.addAll(arr);
    }
    public List<Point> getPoints() {
        return points;
    }

    public double getLength() {
        if (points.size() < 2) return 0;
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            Line line = new Line(points.get(i-1), points.get(i));
            length += line.getLength();
        }
        return length;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return this;
    }
}