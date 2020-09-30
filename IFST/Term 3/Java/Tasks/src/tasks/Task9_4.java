package tasks;

public class Task9_4 {
    public static void main(String[] args) {
        Rifle r1 = new Rifle();
        r1.reload(50);
        r1.shoot(5);
    }
}

class Rifle extends Pistol {
    private int rateOfFire;

    public Rifle(int maxAmmo, int rateOfFire) {
        super(maxAmmo);
        if (rateOfFire < 0) throw new IllegalArgumentException();
        this.rateOfFire = rateOfFire;
    }
    public Rifle(int maxAmmo){
        this(maxAmmo, maxAmmo / 2);
    }
    public Rifle(){this(30,30);}

    public void shoot(int n) {
        if (n < 0) throw new IllegalArgumentException();
        for (int i = 0; i < n * rateOfFire; i++) {
            if (ammo == 0) reload(maxAmmo);
            super.shoot();
        }
    }
}