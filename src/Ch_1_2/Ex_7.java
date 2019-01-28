package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_7 {
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = mystery(s.substring(0, N / 2));
        String b = mystery(s.substring(N / 2, N));
        return mystery(a) + mystery(b);
    }

    public static void main(String[] args) {
        String s = "Hello, World!";
        StdOut.println(mystery(s));
    }

}
