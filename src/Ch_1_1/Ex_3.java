package Ch_1_1;
import edu.princeton.cs.algs4.*;

public class Ex_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if ((a == b) && (b == c)) {
            StdOut.println("equal");
        }
        else {
            StdOut.println("not equal");
        }
    }
}
