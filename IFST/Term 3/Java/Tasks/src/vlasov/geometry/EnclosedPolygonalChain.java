package vlasov.geometry;

import java.util.ArrayList;

//Task9_1

public class EnclosedPolygonalChain extends PolygonalChain implements Lengthable {

    public EnclosedPolygonalChain(ArrayList<Point> points) {
        super(points);
    }
    public EnclosedPolygonalChain(PolygonalChain pc) {super(pc.getPoints());}
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