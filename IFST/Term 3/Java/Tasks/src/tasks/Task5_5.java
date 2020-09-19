package tasks;

public class Task5_5 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,4);
        Fraction f2 = new Fraction(2,6);
        Fraction f3 = new Fraction(4,10);
        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));

        System.out.println(f1.sum(f2).div(f3).minus(5));
    }
}
class Fraction {
    int num;
    int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }
    private Fraction(){}

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    int lcd(int a, int b) {
        return a / gcd(a,b) * b;
    }
    public Fraction sum(Fraction f2) {
        Fraction res = new Fraction();
        res.den = lcd(this.den, f2.den);
        res.num = this.num * (res.den / this.den) + f2.num * (res.den / f2.den);
        reduce(res);
        return res;
    }
    void reduce(Fraction f) {
        int gcd = gcd(f.num, f.den);
        f.num /= gcd;
        f.den /= gcd;
    }
    Fraction sum(int n){
        return this.sum(new Fraction(n * n, n));
    }
    
    public Fraction minus(Fraction f2) {
        Fraction res = new Fraction();
        res.den = lcd(this.den, f2.den);
        res.num = this.num * (res.den / this.den) - f2.num * (res.den / f2.den);
        reduce(res);
        return res;
    }
    Fraction minus(int n) {
        return this.minus(new Fraction(n * n, n));
    }

    public Fraction multiply(Fraction f2) {
        Fraction res = new Fraction();
        res.num = this.num * f2.num;
        res.den = this.den * f2.den;
        reduce(res);
        return res;
    }
    Fraction multiply(int n) {
        return this.multiply(new Fraction(n * n, n));
    }

    public Fraction div(Fraction f2) {
        Fraction res = new Fraction();
        res.num = this.num * f2.den;
        res.den = this.den * f2.num;
        reduce(res);
        return res;
    }

    public String toString() {
        return num + "/" + den;
    }
}