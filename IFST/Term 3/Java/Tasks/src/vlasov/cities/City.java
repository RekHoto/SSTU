package vlasov.cities;

//Task3_3

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
    String name;
    List<Way> ways = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }
    City(){}
    public void addWay(Way way) {
        if (ways.contains(way)) throw new RuntimeException();
        ways.add(way);
    }
    public String toString() {
        String str = "Город " + name + ":";
        for (int i = 0; i < ways.size(); i++) {
            str += "\n   " + ways.get(i);
        }

        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return Objects.equals(ways, city.ways);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ways);
    }
}