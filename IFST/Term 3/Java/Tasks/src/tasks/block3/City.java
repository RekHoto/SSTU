package tasks.block3;

//Task3_3

public class City {
    String name;
    Way[] ways;

    public City(String name, Way[] ways) {
        this.name = name;
        this.ways = ways;
    }

    City(){}
    City(String name){this(name, null);}

    public String toString() {
        String str = "Город " + name + ":";
        for (int i = 0; i < ways.length; i++) {
            str += "\n   " + ways[i];
        }

        return str;
    }
}

class Way {
    City dest;
    int price;

    public Way(City dest, int price) {
        this.dest = dest;
        this.price = price;
    }

    public String toString() {
        return "Город " + dest.name + ": " + price;
    }
}