package Ch_1_1;
import edu.princeton.cs.algs4.*;

public class Ex_13 {
    public static void main(String[] args) {
        int M = 8;
        int N = 7;
        int[][] matrix = new int[M][N];
        int[][] transformMatrix = new int[N][M];

        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = count++;
                transformMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += 1;
                StdOut.printf("%d\t", matrix[i][j]);
                if (sum % N == 0)
                    StdOut.printf("\n");
            }
        }
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += 1;
                StdOut.printf("%d\t", transformMatrix[i][j]);
                if (sum % M == 0)
                    StdOut.printf("\n");
            }
        }
    }
}
