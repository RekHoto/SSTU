package vlasov.weapon;

//Task9_4

public class Rifle extends Pistol {
    private int rateOfFire;

    public Rifle(int maxAmmo, int rateOfFire) { //osnovnoi
        super(maxAmmo); // vyzov konstruktora roditelya
        if (rateOfFire < 0) throw new IllegalArgumentException();
        this.rateOfFire = rateOfFire; // prisvoenie peremennoi potomku
    }
    public Rifle(int maxAmmo){
        this(maxAmmo, maxAmmo / 2);
    } //vyzov osnovnogo
    public Rifle(){this(30,30);} //vyzov osnovnogo

    public void shoot(int n) {
        if (n < 0) throw new IllegalArgumentException();
        for (int i = 0; i < n * rateOfFire; i++) {
            if (!getAmmo()) reload(capacity());
            super.shoot();
        }
    }
}