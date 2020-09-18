package tasks;

public class Task1_6 {
    public static void main(String[] args) {
        House1_6 n = new House1_6(1);
        House1_6 n2 = new House1_6(5);
        House1_6 n3 = new House1_6(23);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}
class House1_6 {
    int f;

    public House1_6(int f) {
        this.f = f;
    }

    public String toString() {
        return "Дом с " + f + (f % 10 != 1 || f % 100 == 11 ? " этажами" : " этажом");
    }
}