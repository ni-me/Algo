package Ch_1_1;

import edu.princeton.cs.algs4.*;

public class Ex_19 {
     //斐波那契数列

     /*
    public static long F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N - 1) + F(N - 2);
    }
    */

    public static long Fibonacci(int N) {
        long m = 0;
        long n = 1;

        for (int i = 0; i < N; i++) {
            m = m + n;
            n = m - n;
        }
        return m;
    }

    public static void Fib(long[] f, int N) {
        f[N] = Fibonacci(N);
    }

    public static void main(String[] args) {
        long[] f = new long[100];
        for (int N = 0; N < 100; N++) {
            Fib(f, N);
            StdOut.println(f[N]);
        }
    }
}


