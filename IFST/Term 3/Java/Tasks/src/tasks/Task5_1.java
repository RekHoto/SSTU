package tasks;

public class Task5_1 {
    public static void main(String[] args) {
        Gun g1 = new Gun(3);
        for (int i = 0; i < 5; i++) {
            g1.shoot();
        }
    }
}

class Gun {
    int ammo;

    public Gun(int ammo) {
        this.ammo = ammo;
    }
    Gun(){this(5);}

    public void shoot() {
        if (ammo > 0) {
            System.out.println("Бах!");
            ammo--;
        } else {
            System.out.println("Клац!");
        }
    }
}