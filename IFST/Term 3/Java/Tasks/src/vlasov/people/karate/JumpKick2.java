package vlasov.people.karate;

public class JumpKick2 implements Hit {
    public static final JumpKick2 INSTANCE = new JumpKick2();

    private JumpKick2(){}

    @Override
    public void hit(Karatist k) {
        k.jumpKick();
    }
}
