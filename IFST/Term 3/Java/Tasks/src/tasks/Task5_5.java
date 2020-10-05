package tasks;

public class Task5_5 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(-2,4);
        Fraction f2 = new Fraction(2,6);
        Fraction f3 = new Fraction(4,10);
        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));

        System.out.println(f1.sum(f2).div(f3).minus(5).doubleValue());
    }
}
final class Fraction extends Number {
    final int num;
    final int den;

    public Fraction(int num, int den) {
        if (den == 0) throw new IllegalArgumentException();
        if (den < 0) {
            this.num = -num;
            this.den = -den;
        } else {
            this.num = num;
            this.den = den;
        }

    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    int lcd(int a, int b) {
        return a / gcd(a,b) * b;
    }

    int[] reduce(int num, int den) {
        int gcd = gcd(num, den);
        num /= gcd;
        den /= gcd;
        return new int[]{num, den};
    }

    public Fraction sum(Fraction f2) {
        int den = lcd(this.den, f2.den);
        int num = this.num * (den / this.den) + f2.num * (den / f2.den);
        int[] res = reduce(num, den);
        return new Fraction(res[0], res[1]);
    }

    Fraction sum(int n){
        return this.sum(new Fraction(n * n, n));
    }
    
    public Fraction minus(Fraction f2) {
        int den = lcd(this.den, f2.den);
        int num = this.num * (den / this.den) - f2.num * (den / f2.den);
        int[] res = reduce(num, den);
        return new Fraction(res[0], res[1]);
    }
    Fraction minus(int n) {
        return this.minus(new Fraction(n * n, n));
    }

    public Fraction multiply(Fraction f2) {
        int num = this.num * f2.num;
        int den = this.den * f2.den;
        int[] res = reduce(num, den);
        return new Fraction(res[0], res[1]);
    }
    Fraction multiply(int n) {
        return this.multiply(new Fraction(n * n, n));
    }

    public Fraction div(Fraction f2) {
        int num = this.num * f2.den;
        int den = this.den * f2.num;
        int[] res = reduce(num, den);
        return new Fraction(res[0], res[1]);
    }

    public String toString() {
        return num + "/" + den;
    }

    @Override
    public int intValue() {
        return num / den;
    }

    @Override
    public long longValue() {
        return (long)num / (long)den;
    }

    @Override
    public float floatValue() {
        return (float) num / (float) den;
    }

    @Override
    public double doubleValue() {
        return (double) num / (double) den;
    }
}