package Ch_1_1;
import edu.princeton.cs.algs4.*;

public class Ex_36 {
    public static void reset(int[] a) {
        for (int i = 0; i < a.length; i++) a[i] = i;
    }
    public static int[][] shuffleTest(int M, int N) {
        int[] a = new int[M];
        int[][] b = new int[M][M];
        for (int i = 0; i < N; i++) {
            reset(a);
            StdRandom.shuffle(a);
            for (int j = 0; j < M; j++) {
                b[a[j]][j]++;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int[][] a = shuffleTest(M, N);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                StdOut.printf("%-7d ", a[i][j]);
            }
            StdOut.println();
        }
    }
}


