package cities;

public class Way {
    private City dest;
    private int price;

    public Way(City dest, int price) {
        this.dest = dest;
        this.price = price;
    }
    public City getDest() {
        return dest;
    }
    public int getPrice() {
        return price;
    }
    public String toString() {
        return "Город " + dest.name + ": " + price;
    }
}