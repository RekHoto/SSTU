public class Task1_6 {
    public static void main(String[] args) {
        House n = new House(1);
        House n2 = new House(5);
        House n3 = new House(11);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}
class House {
    int f;

    public House(int f) {
        this.f = f;
    }

    public String toString() {
        return "Дом с " + f + (f % 10 != 1 || f == 11 ? " этажами" : " этажом");
    }
}