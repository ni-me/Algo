package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_17 {
    private int numerator;
    private int denominator;


    public Ex_17(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("denominator is zero\n");
        } else if (numerator > Integer.MAX_VALUE || numerator < Integer.MIN_VALUE) {
            throw new RuntimeException("numerator overflows\n");
        } else if (denominator > Integer.MAX_VALUE || denominator < Integer.MIN_VALUE) {
            throw new RuntimeException("denominator overflows\n");
        } else {
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
    }

    private int gcd(int p, int q) {
        if (p == 0) return q;
        if (q == 0) return Math.abs(p);
        return gcd(q, p % q);
    }

    private Ex_17 prime(int a, int b) {
        int c;
        while ((c = gcd(a, b)) > 1) {
            a /= c;
            b /= c;
        }
        Ex_17 d = new Ex_17(a, b);
        return d;
    }

    public Ex_17 plus(Ex_17 b) {
        int temp_numerator;
        int temp_denominator;

        temp_numerator = numerator * b.denominator + b.numerator * denominator;
        temp_denominator = denominator * b.denominator;
        Ex_17 c = prime(temp_numerator, temp_denominator);
        return c;
    }

    public Ex_17 minus(Ex_17 b) {
        int temp_numerator;
        int temp_denominator;

        temp_numerator = numerator * b.denominator - b.numerator * denominator;
        temp_denominator = denominator * b.denominator;
        Ex_17 c = prime(temp_numerator, temp_denominator);
        return c;
    }

    public Ex_17 times(Ex_17 b) {
        int temp_numerator;
        int temp_denominator;

        Ex_17 c;
        temp_numerator = numerator * b.numerator;
        temp_denominator = denominator * b.denominator;
        c = prime(temp_numerator, temp_denominator);
        return c;
    }

    public Ex_17 divides(Ex_17 b) {
        int temp_numerator;
        int temp_denominator;

        Ex_17 c;
        temp_numerator = b.denominator * numerator;
        temp_denominator = denominator * b.numerator;
        c = prime(temp_numerator, temp_denominator);
        return c;
    }

    public boolean equal(Ex_17 b) {
        Ex_17 c = prime(numerator, denominator);
        Ex_17 d = prime(b.numerator, b.denominator);

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
        Ex_17 a = new Ex_17(411111111, -8);
        Ex_17 b = new Ex_17(3, 6);
        StdOut.println(a);
        StdOut.println(b);
        StdOut.println(a.times(b));
        StdOut.println(a.divides(b));
        StdOut.println(a.plus(b));
        StdOut.println(a.minus(b));
        StdOut.println(a.equal(b));
    }
}
