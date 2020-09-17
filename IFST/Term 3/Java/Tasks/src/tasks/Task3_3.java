package tasks;

public class Task3_3 {
    public static void main(String[] args) {
        City c1 = new City(); City c2 = new City(); City c3 = new City();
        City c4 = new City(); City c5 = new City(); City c6 = new City();
        c1.name = "A"; c2.name = "B"; c3.name = "C";
        c4.name = "D"; c5.name = "E"; c6.name = "F";

        c1.ways = new Way[]{new Way(c2, 5), new Way(c4, 6), new Way(c6,1)};
        c2.ways = new Way[]{new Way(c1, 5), new Way(c3, 3)};
        c3.ways = new Way[]{new Way(c2, 3), new Way(c4, 4)};
        c4.ways = new Way[]{new Way(c1, 6), new Way(c3, 4), new Way(c5,2)};
        c5.ways = new Way[]{new Way(c6, 2)};
        c6.ways = new Way[]{new Way(c2, 1), new Way(c5, 2)};

        System.out.println(c1); System.out.println(c2); System.out.println(c3);
        System.out.println(c4); System.out.println(c5); System.out.println(c6);
    }
}

class City {
    String name;
    Way[] ways;

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