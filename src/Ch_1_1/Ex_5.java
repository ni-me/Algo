package Ch_1_1;

import edu.princeton.cs.algs4.StdOut;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if ((x > 0.0 && x < 1.0) && (y > 0.0 && y < 1.0)) {
            StdOut.println("true");
        }
        else {
            StdOut.println("false");
        }
    }
}
