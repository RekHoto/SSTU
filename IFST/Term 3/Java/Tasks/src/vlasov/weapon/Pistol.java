package vlasov.weapon;

//Task5_1

public class Pistol extends Weapon {

    int maxAmmo;

    public Pistol(int maxAmmo) {
        super(0);
        this.maxAmmo = maxAmmo;
    }

    public int capacity() {
        return maxAmmo;
    }
    public void unload() {
        ammo = 0;
    }
    public boolean isLoaded() {
        if (ammo == 0) return false;
        return true;
    }
    public int currentAmmo() {
        return ammo;
    }

    public void shoot() {
        if (getAmmo()) {
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }
}