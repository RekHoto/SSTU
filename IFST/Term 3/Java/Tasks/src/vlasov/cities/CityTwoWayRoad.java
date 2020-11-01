package vlasov.cities;

public class CityTwoWayRoad extends City {

    public CityTwoWayRoad(String name) {
        super(name);
    }


    @Override
    public void addWay(Way way) {
        super.addWay(way);
        way.getDest().addWay(new Way(this, way.getPrice()));
    }


}
