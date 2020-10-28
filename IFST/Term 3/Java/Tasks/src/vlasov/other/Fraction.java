/*
 * Copyright (c) RekHoto 2020.
 */

package vlasov.other;

public final class Fraction extends Number {
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
        return this.sum(new Fraction(n, 1));
    }
    
    public Fraction minus(Fraction f2) {
        int den = lcd(this.den, f2.den);
        int num = this.num * (den / this.den) - f2.num * (den / f2.den);
        int[] res = reduce(num, den);
        return new Fraction(res[0], res[1]);
    }
    Fraction minus(int n) {
        return this.minus(new Fraction(n, 1));
    }

    public Fraction multiply(Fraction f2) {
        int num = this.num * f2.num;
        int den = this.den * f2.den;
        int[] res = reduce(num, den);
        return new Fraction(res[0], res[1]);
    }
    Fraction multiply(int n) {
        return this.multiply(new Fraction(n, 1));
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        Fraction fr = (Fraction) obj;
        if (this.num != fr.num) return false;
        return this.den == fr.den;
    }


}