package vlasov.weapon;

//Task5_1

public class Pistol extends Weapon {
    public Pistol(int maxAmmo) {
        super(maxAmmo);
    }

    public void shoot() {
        if (getAmmo()) {
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }
}