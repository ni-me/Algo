package Ch_1_1;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Ex_29 {

    public static int rank (int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int num = -1;

        if (key > a[hi]) return a.length;
        if (key < a[lo]) return 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) lo = mid + 1;
            else if (key < a[mid]) hi = mid - 1;
            else {
                while (mid > 0 && a[mid] == a[mid - 1]) mid--;
                num =  mid;
                break;
            };
        }

        if (num == -1) {
            while (key < a[lo]) {
                lo--;
            }
            num = lo + 1;
        }
        return num;
    }

    public static int count(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int num = 0;

        if (key < a[lo] || key > a[hi]) return 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) lo = mid + 1;
            else if (key < a[mid]) hi = mid - 1;
            else {
                while (mid > 0 && a[mid] == a[mid - 1]) mid--;
                while (mid < a.length - 1 && a[mid] == a[mid + 1]) {
                    mid++;
                    num++;
                }
                num += 1;
                break;
            }
        }

        return num;

    }

    public static void main(String[] args) {
        int[] a = {1,1,3,4,6,6,6,7,8,9,10,11,12};
        StdOut.println(rank(6,a));
        StdOut.println(count(6, a));
    }
}