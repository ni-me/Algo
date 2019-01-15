package Ch_1_1;
import edu.princeton.cs.algs4.*;

public class Ex_7 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);

        int sum_1 = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum_1++;
        StdOut.println(sum_1);

        int sum_2 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum_2++;
        StdOut.println(sum_2);
    }
}
