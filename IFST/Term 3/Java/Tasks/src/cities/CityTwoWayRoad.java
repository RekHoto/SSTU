package cities;

import java.util.ArrayList;

public class CityTwoWayRoad extends City {

    public CityTwoWayRoad(String name, ArrayList<Way> ways) {
        super(name, ways);
    }

    public CityTwoWayRoad(String name) {
        this(name, null);
    }

    @Override
    public void addWay(Way way) {
        super.addWay(way);
        way.getDest().addWay(new Way(this, way.getPrice()));
    }


}
