package Ch_1_1;

import edu.princeton.cs.algs4.*;

public class Ex_32 {
    private static final int WEIGHT = 800;
    private static final int HEIGHT = 600;

    public static double[] axis(int N, double l, double r) {
        double k = (r - l) / N;
        double sum = l;
        double[] axis = new double[N + 1];

        for (int i = 0; i < N + 1; i++) {
            axis[i] = sum;
            sum += k;
        }
        return axis;
    }

    public static int count(double k, double[] a) {
        int r = -1;
        for (int i = 0; i < a.length - 1; i++) {
            if (k <= a[0] || k >= a[a.length - 1]) break;
            if (k > a[i] && k <= a[i + 1]) {
                r = i;
                break;
            }
        }
        return r;
    }

    public static void drawSet() {
        StdDraw.setCanvasSize(WEIGHT, HEIGHT);
        StdDraw.setXscale(0, WEIGHT);
        StdDraw.setYscale(0, HEIGHT);
    }

    public static void draw(double[] a) {
        double ySpace = HEIGHT / StdStats.max(a);
        double xSpace = WEIGHT / a.length;
        double blink = 50;

        for (int i = 0; i < a.length; i++) {
            StdDraw.filledRectangle((xSpace/2) + (xSpace*i), (ySpace*a[i]) / 2, (xSpace/2) - (blink/a.length), (ySpace*a[i]) / 2);
        }
    }

    public static void main(String[] args) {
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        int N = Integer.parseInt(args[0]);

        double[] b = axis(N, l, r);
        double[] c = new double[N];

        int q = -1;
        while (!StdIn.isEmpty()) {
            double a = StdIn.readDouble();
            q = count(a, b);
            if (q >= 0) c[q]++;
        }

        drawSet();
        draw(c);
    }

}
