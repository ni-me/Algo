package Ch_1_1;
import edu.princeton.cs.algs4.*;

public class Ex_30 {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
    public static void main(String[] args) {
        int N = 10;
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 1 || j == 1) a[i][j] = true;
                else if (i == 0 || j == 0) a[i][j] = false;
                else if (gcd(i, j) == 1) a[i][j] = true;
                else a[i][j] = false;
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (count++ % N == 0) StdOut.printf("\n");
                StdOut.printf("%-7b ", a[i][j]);
            }
        }
    }
}
