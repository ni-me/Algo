package Ch_1_1;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Ex_39 {

        public static int[] randomArray(int N) {
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform(100000, 1000000);
            }
            return a;
        }

        //去除数组中的重复元素
        public static int[] duplicateRemoval(int[] a) {
            Arrays.sort(a);
            int[] b = new int[a.length];
            b[0] = a[0];
            int count = 1;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] != a[i + 1]) {
                    b[count++] = a[i + 1];
                }
            }
            int[] c = new int[count];
            for (int i = 0; i < count; i++) c[i] = b[i];
            return c;
        }

        public static int BinarySearch(int key, int[] a) {
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

        public static int experiment(int N) {
            int[] a = randomArray(N);
            int[] b = randomArray(N);
            int[] c = duplicateRemoval(a);

            Arrays.sort(b);
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if (BinarySearch(c[i], b) > 0) count++;
            }
            return count;
        }

        public static void batch(int T, int N) {
            int count = 0;
            for (int i = 0; i < T; i++) {
                count += experiment(N);
            }

            double ave = 1.0 * count / T;
            StdOut.printf("%7d: %-9.2f\n", N, ave);

        }

        public static void main(String[] args) {
            //int T = Integer.parseInt(args[0]);

            int T = 15;
            int[] N = {1000, 10000, 100000, 1000000};

            for (int k = 0; k < N.length; k++) {
                batch(T, N[k]);
            }
        }

}

