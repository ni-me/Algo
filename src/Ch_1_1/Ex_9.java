package Ch_1_1;

import edu.princeton.cs.algs4.*;
public class Ex_9 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        String s = "";

        for (int n = N; n > 0; n /= 2)
            s = String.valueOf(n % 2) + s;

        StdOut.println(s);
    }
}
