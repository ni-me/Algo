package Ch_1_1;

import edu.princeton.cs.algs4.*;

public class Average {

    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()) {
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("%.2f %d\n", avg, cnt);
    }

}
