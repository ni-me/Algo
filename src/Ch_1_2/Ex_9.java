package Ch_1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex_9 {
    public static int rank(int key, int[] a, Counter b) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            b.increment();
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) lo = mid + 1;
            else if (key < a[mid]) hi = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] white_list = new In(args[0]).readAllInts();
        Arrays.sort(white_list);
        Counter b = new Counter("Key");

        while (!StdIn.isEmpty()) {
            int k = StdIn.readInt();
            if (rank(k, white_list, b) >= 0) {
                StdOut.println(b.toString());
            }
        }
    }
}
