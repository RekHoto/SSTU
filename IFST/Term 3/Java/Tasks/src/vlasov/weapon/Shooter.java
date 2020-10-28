package vlasov.weapon;

public class Shooter {
    String name;
    Weapon weapon;

    public Shooter(String name) {this.name = name;}

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Weapon getWeapon() {
        return weapon;
    }

    public void shoot() {
        if (weapon == null) {
            System.out.println("Ne mogu uchastvovat' v perestrelke");
            return;
        }
        weapon.shoot();
    }
}
