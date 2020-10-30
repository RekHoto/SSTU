package cities;

//Task3_3

import java.util.ArrayList;
import java.util.List;

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
}