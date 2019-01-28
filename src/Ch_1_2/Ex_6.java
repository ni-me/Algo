package Ch_1_2;


import edu.princeton.cs.algs4.*;

public class Ex_6 {
    public static boolean isCircularRotation(String s, String t) {
        return s.length() == t.length() && s.concat(s).indexOf(t) >= 0;
    }

    public static void main(String[] args) {
        String s = StdIn.readLine();
        String t = StdIn.readLine();
        StdOut.println(isCircularRotation(s, t));
    }
}
