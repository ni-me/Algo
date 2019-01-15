package Ch_1_1;
import edu.princeton.cs.algs4.*;
public class Ex_14 {
    public static int lg(int N) {
        int i = 1;
        int count = 0;
        while (i <= N) {
            i *= 2;
            count++;
        }
        return count - 1;
    }
    public static void main(String[] args) {
        int N = StdIn.readInt();
        StdOut.println(lg(N));
    }
}
