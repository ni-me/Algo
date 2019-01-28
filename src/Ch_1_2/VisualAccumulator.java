package Ch_1_2;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(double trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(Color.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(Color.RED);
        StdDraw.point(N, total / N);
    }

    public static void main(String[] args) {
        int T = 2000;
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int i = 0; i < T; i++) {
            a.addDataValue(Math.random());
        }

        StdOut.println(a);
    }
}
