package vlasov.other;

//Task4_3

public class House {
    final int f;

    public House(int f) {
        if (f < 1) throw new IllegalArgumentException("этажей не может быть меньше 1");
        this.f = f;
    }

    public String toString() {
        return "Дом с " + f + (f % 10 != 1 || f % 100 == 11 ? " этажами" : " этажом");
    }
}