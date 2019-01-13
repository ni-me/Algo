package Ch_1_1;
import java.util.Scanner;

public class GCD {
    public static int gcd(int p, int q) {
        if (q == 0) {return  p;}
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int result;
        Scanner i = new Scanner(System.in);
        int p = i.nextInt();
        int q = i.nextInt();
        result = gcd(p, q);
        System.out.println(result);
    }

}
