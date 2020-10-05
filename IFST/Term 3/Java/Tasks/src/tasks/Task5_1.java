package tasks;

public class Task5_1 {
    public static void main(String[] args) {
        Pistol g1 = new Pistol(7);
        g1.reload(3);
        for (int i = 0; i < 5; i++) {
            g1.shoot();
        }

    }
}

class Pistol extends Weapon {
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