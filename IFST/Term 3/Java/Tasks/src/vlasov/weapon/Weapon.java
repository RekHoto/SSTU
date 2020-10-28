package vlasov.weapon;

public abstract class Weapon {
    int ammo;

    public Weapon(int ammo) {
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
    }

    abstract void shoot();

    public boolean getAmmo() {
        if (ammo == 0) return false;
        ammo--;
        return true;
    }

    public void load(int ammo) {
        if (ammo < 0) throw new RuntimeException();
        this.ammo+=ammo;
    }
}