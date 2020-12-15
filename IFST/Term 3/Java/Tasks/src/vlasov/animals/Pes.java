package vlasov.animals;

public class Pes implements Gavkable{
    String name;

    public Pes(String name) {
        this.name = name;
    }
    public void gav() {
        System.out.println(name + ": Гав!");
    }
    public void gav(int n) {
        String str = name + ": ";
        for (int i = 0; i < n; i++) {
            str += i == n - 1 ? "гав" : "гав-";
        }
        System.out.println(str);
    }

    public String toString() {
        return "пёс: " + name;
    }
}
