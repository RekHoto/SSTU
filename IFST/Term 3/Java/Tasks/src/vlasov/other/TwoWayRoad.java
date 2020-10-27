package vlasov.other;

import java.util.ArrayList;

public class TwoWayRoad extends City {

    public TwoWayRoad(String name, ArrayList<Way> ways) {
        super(name, ways);
    }

    public TwoWayRoad(String name) {
        this(name, null);
    }

    @Override
    public void addWay(Way way) {
        super.addWay(way);
        way.getDest().addWay(new Way(this, way.getPrice()));
    }


}
