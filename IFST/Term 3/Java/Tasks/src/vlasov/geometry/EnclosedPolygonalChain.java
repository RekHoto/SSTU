package vlasov.geometry;

import java.util.ArrayList;

//Task9_1

public class EnclosedPolygonalChain extends PolygonalChain implements ObjectWithLength{

    public EnclosedPolygonalChain(ArrayList<Point> points) {
        super(points);
    }
    public EnclosedPolygonalChain() {
        super();
    }

    public double getLength() {
        double length = super.getLength();
        Line line = new Line(points.get(points.size()-1), points.get(0));
        length += line.getLength();
        return length;
    }
}