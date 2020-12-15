package vlasov.people.karate;

public enum Punch implements Hit {
    INSTANCE;

    @Override
    public void hit(Karatist k) {
        k.punch();
    }
}
