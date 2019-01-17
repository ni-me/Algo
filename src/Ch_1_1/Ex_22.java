package Ch_1_1;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Ex_22 {
    public static int rank(int key, int[] a, int lo, int hi, int index) {
        repeat(index, lo, hi);
        int mid = lo + (hi - lo) /2;
        if (hi < lo) {
            return -1;
        }

        if (a[mid] > key) {
            return rank(key, a, lo, mid - 1, index + 1);
        }
        else if (a[mid] < key) {
            return rank(key, a, mid + 1, hi, index + 1);
        }
        else {
            return mid;
        }
    }
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static void repeat(int N , int lo, int hi) {
        String s = "";
        for (int i = 0; i < N * 4; i++) {
            s = s + " ";
        }
        StdOut.printf("%s %d - %d\n", s, lo, hi);
    }

    public static void main(String[] args) {
        int[] a = new In(args[0]).readAllInts();
        Arrays.sort(a);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, a) < 0) {
                StdOut.println(key);
            }
        }
    }
}
