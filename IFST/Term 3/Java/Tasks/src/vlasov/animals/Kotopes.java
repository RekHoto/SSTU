package vlasov.animals;

public class Kotopes implements Meowable, Gavkable {
    private Cat cat;
    private Pes pes;

    public Kotopes(String name) {
        this.cat = new Cat(name);
        this.pes = new Pes(name);
    }

    @Override
    public void gav() {
        pes.gav();
    }

    @Override
    public void meow() {
        cat.meow();
    }

    public void golos() {
        meow();
        gav();
    }
}
