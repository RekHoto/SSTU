package vlasov.math.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PolygonalChain implements Lengthable, PolygonalChainable, Moveable {
    List<Point<Integer>> points = new ArrayList<>();

    public PolygonalChain(List<Point<Integer>> points) {
        this.points.addAll(points);
    }

    public PolygonalChain(Point<Integer>... points) {
        for (Point<Integer> p : points) addPoint(p);
    }

    public void addPoint(Point<Integer> p) {
        this.points.add(p);
    }

    public void addPoints(List<Point<Integer>> arr) {
        points.addAll(arr);
    }

    public List<Point<Integer>> getPoints() {
        return points;
    }

    public double getLength() {
        if (points.size() < 2) return 0;
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            Line line = new Line(points.get(i - 1), points.get(i));
            length += line.getLength();
        }
        return length;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolygonalChain)) return false;
        PolygonalChain that = (PolygonalChain) o;
        return Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return points != null ? points.hashCode() : 0;
    }

    @Override
    public void move(int x, int y) {
        for (Point<Integer> point : points) {
            point.x += x;
            point.y += y;
        }
    }
}