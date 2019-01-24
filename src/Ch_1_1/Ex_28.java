package Ch_1_1;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Ex_28 {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) lo = mid + 1;
            else if (key < a[mid]) hi = mid - 1;
            else return a[mid];
        }
        return -1;
    }

    public static int[] remove(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[0];
        int j = 1;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                    b[j++] = a[i + 1];
            }
        }

        int[] t = new int[j];
        System.arraycopy(b, 0, t, 0, j);
        return t;
    }

    public static void main(String[] args) {

        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        int[] t = remove(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, t) < 0) {
                StdOut.println(key);
            }
        }
    }
}
