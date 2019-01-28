package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] t = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            double lo = StdIn.readDouble();
            double hi = StdIn.readDouble();
            Interval1D interval = new Interval1D(lo, hi);
            t[i] = interval;
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (t[i].intersects(t[j])) {
                    StdOut.println(t[i] + " interval " + t[j]);

                }
            }
        }
    }
}
