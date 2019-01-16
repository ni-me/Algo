package Ch_1_1;
import edu.princeton.cs.algs4.*;

public class Ex_24 {
    public static int gcd(int p, int q) {
        StdOut.printf("p:%-9d\tq:%-9d\n", p, q);
        if ( q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
    public static void main(String[] args) {
        StdOut.println(gcd(1111111, 1234567));
    }
}
