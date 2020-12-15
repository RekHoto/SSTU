package vlasov.people.karate;

public enum JumpKick implements Hit {
    INSTANCE;
    @Override
    public void hit(Karatist k) {
        k.jumpKick();
    }
}
