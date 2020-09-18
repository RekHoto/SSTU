package tasks;

public class Task4_3 {
    public static void main(String[] args) {
        House n = new House(1);
        House n2 = new House(5);
        House n3 = new House(23);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}
class House {
    final int f;

    public House(int f) {
        this.f = f;
    }

    public String toString() {
        return "Дом с " + f + (f % 10 != 1 || f % 100 == 11 ? " этажами" : " этажом");
    }
}