package tasks.block1;

//Task1_6

public class House {
    int f;

    public House(int f) {
        this.f = f;
    }

    public String toString() {
        return "Дом с " + f + (f % 10 != 1 || f % 100 == 11 ? " этажами" : " этажом");
    }
}