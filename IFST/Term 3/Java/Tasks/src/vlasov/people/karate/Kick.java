package vlasov.people.karate;

public enum Kick implements Hit {
    INSTANCE;

    @Override
    public void hit(Karatist k) {
        k.kick();
    }
}
