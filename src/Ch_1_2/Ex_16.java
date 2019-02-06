package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_16 {
    private int numerator;
    private int denominator;


    public Ex_16(int numerator, int denominator) {
        int c;
        while ((c = gcd(numerator, denominator)) > 1) {
            numerator /= c;
            denominator /= c;
        }
        if (numerator > 0 && denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    private int gcd(int p, int q) {
        if (p == 0) return q;
        if (q == 0) return Math.abs(p);
        return gcd(q, p % q);
    }

    private Ex_16 prime(int a, int b) {
        int c;
        while ((c = gcd(a, b)) > 1) {
            a /= c;
            b /= c;
        }
        Ex_16 d = new Ex_16(a, b);
        return d;
    }

    public Ex_16 plus(Ex_16 b) {
        int temp_numerator;
        int temp_denominator;

        temp_numerator = numerator * b.denominator + b.numerator * denominator;
        temp_denominator = denominator * b.denominator;
        Ex_16 c = prime(temp_numerator, temp_denominator);
        return c;
    }

    public Ex_16 minus(Ex_16 b) {
        int temp_numerator;
        int temp_denominator;

        temp_numerator = numerator * b.denominator - b.numerator * denominator;
        temp_denominator = denominator * b.denominator;
        Ex_16 c = prime(temp_numerator, temp_denominator);
        return c;
    }

    public Ex_16 times(Ex_16 b) {
        int temp_numerator;
        int temp_denominator;

        Ex_16 c;
        temp_numerator = numerator * b.numerator;
        temp_denominator = denominator * b.denominator;
        c = prime(temp_numerator, temp_denominator);
        return c;
    }

    public Ex_16 divides(Ex_16 b) {
        int temp_numerator;
        int temp_denominator;

        Ex_16 c;
        temp_numerator = b.denominator * numerator;
        temp_denominator = denominator * b.numerator;
        c = prime(temp_numerator, temp_denominator);
        return c;
    }

    public boolean equal(Ex_16 b) {
        Ex_16 c = prime(numerator, denominator);
        Ex_16 d = prime(b.numerator, b.denominator);

        if ((c.numerator == d.numerator) && (c.denominator == d.denominator)) return true;
        return false;
    }

    public String toString() {
        if (numerator < 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Ex_16 a = new Ex_16(4, -8);
        Ex_16 b = new Ex_16(3, -6);
        StdOut.println(a);
        StdOut.println(b);
        StdOut.println(a.times(b));
        StdOut.println(a.divides(b));
        StdOut.println(a.plus(b));
        StdOut.println(a.minus(b));
        StdOut.println(a.equal(b));
    }
}
