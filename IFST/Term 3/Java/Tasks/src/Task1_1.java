public class Task1_1 {
    public static void main(String[] args) {
        Coord n = new Coord(1, -2);
        Coord n2 = new Coord(4, 5);
        Coord n3 = new Coord(10, -7);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}
class Coord {
    int x;
    int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
