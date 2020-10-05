package tasks;

public class Task10_1 {
    public static void main(String[] args) {

    }
}

abstract class Weapon {
    private int ammo;
    final int maxAmmo;

    public Weapon(int maxAmmo) {
        if (maxAmmo < 0) throw new IllegalArgumentException("Патронов не может быть меньше 0");
        this.maxAmmo = maxAmmo;
    }

    public void reload(int ammo) {
        if (ammo < 0) throw new IllegalArgumentException("Патронов не может быть меньше 0");
        this.ammo = Math.min(ammo, maxAmmo);
    }

    public int unload() {
        int temp = ammo;
        ammo = 0;
        return temp;
    }

    public boolean getAmmo() {
        if (ammo == 0) return false;
        ammo--;
        return true;
    }

    public String status() {
        return ammo > 0 ? "Заряжен" : "Не заряжен";
    }

    public abstract void shoot();
}
