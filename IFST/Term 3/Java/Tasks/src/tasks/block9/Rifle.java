package tasks.block9;

import tasks.block5.Pistol;

//Task9_4

public class Rifle extends Pistol {
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
            if (!getAmmo()) reload(capacity());
            super.shoot();
        }
    }
}