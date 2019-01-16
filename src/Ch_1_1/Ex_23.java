package Ch_1_1;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Ex_23 {
    public static int BinarySearch(int key, int[] a, char flag) {
        int lo = 0;
        int hi = a.length - 1;

        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) {
                lo = mid + 1;
            }
            if (key < a[mid]) {
                hi = mid - 1;
            }
            if (key == a[mid]) {
                if (flag == '-') return -(mid + 1);
                if (flag == '+') return mid + 1;
            }
        }
        if (flag == '-') return 1;
        if (flag == '+') return -1;

        return 0;
    }

    public static void main(String[] args) {
        char flag = '-';
        int[] whiteList = new In(args[0]).readAllInts();
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch(key, whiteList, flag) > 0) {
                StdOut.println(key);
            }
        }
    }

}
