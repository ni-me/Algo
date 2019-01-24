package Ch_1_1;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Ex_38 {
    public static int BruteForceSearch(int key, int[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList = new In(args[0]).readAllInts();
        Arrays.sort(whiteList);
        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BruteForceSearch(key, whiteList) < 0)
                StdOut.println(key);
        }
    }
}
