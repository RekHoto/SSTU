package cities;

//Task3_3

import java.util.ArrayList;

public class City {
    String name;
    ArrayList<Way> ways;

    public City(String name, ArrayList<Way> ways) {
        this.name = name;
        this.ways = ways == null ? new ArrayList<Way>() : ways;
    }

    City(){}
    City(String name){this(name, null);}
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