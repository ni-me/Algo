package Ch_1_1;
import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Ex_15 {
    public static int[] histogram(int[] a, int M) {
        int[] s = new int[M];
        Arrays.sort(a);
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < M) {
            if (j < a.length && a[j] <= i) {
                count++;
                j++;
            } else {
                s[i] = count;
                count = 0;
                i++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a = {0,0,1,2,3,5,5,3,4,2,3,5,4,4,1,1};
        int M = 6;
        int[] s = histogram(a, M);
        for (int i = 0; i < M; i++)
            StdOut.println(i + ": " + s[i]);
    }
}
