package tasks;

public class Task5_1 {
    public static void main(String[] args) {
        Gun g1 = new Gun(7);
        g1.reload(3);
        for (int i = 0; i < 5; i++) {
            g1.shoot();
        }

    }
}

class Gun {
    int ammo;
    final int maxAmmo;

    public Gun(int maxAmmo) {
        if (ammo < 0 || maxAmmo < 0) throw new IllegalArgumentException("Патронов не может быть меньше 0");
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }

    public void reload(int ammo) {
        if (ammo < 0) throw new IllegalArgumentException("Патронов не может быть меньше 0");
        this.ammo = ammo < maxAmmo ? ammo : maxAmmo;
    }

    public int unload() {
        int temp = ammo;
        ammo = 0;
        return temp;
    }

    public int getAmmo() {
        return ammo;
    }

    public String status() {
        return ammo > 0 ? "Заряжен" : "Не заряжен";
    }

    public void shoot() {
        if (ammo > 0) {
            System.out.println("Бах!");
            ammo--;
        } else {
            System.out.println("Клац!");
        }
    }
}