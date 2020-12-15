package vlasov.people.karate;

public class Karatist {
    String name;

    public Karatist(String name) {
        this.name = name;
    }

    public void punch() {
        System.out.println(name + "Удар рукой");
    }
    public void jumpKick() {
        System.out.println(name + "Удар в прыжке");
    }
    public void kick(){
        System.out.println(name + "Удар ногой");
    }
}
