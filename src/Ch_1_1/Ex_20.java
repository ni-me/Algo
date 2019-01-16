package Ch_1_1;
import edu.princeton.cs.algs4.*;

public class Ex_20 {
    //计算ln(N!)
    public static double lnFatorial(double N) {
        if (N == 1) {
            return 0;
        }
        return Math.log(N) + lnFatorial(N - 1);
    }

    public static void main(String[] args) {
        double N = StdIn.readDouble();
        StdOut.println(lnFatorial(N));
    }
}

