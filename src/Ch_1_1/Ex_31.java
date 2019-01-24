package Ch_1_1;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class Ex_31 {
    private static final double RAD = 2 * Math.PI;
    private static final double R = 200;
    private static final int WEIGHT = 800;
    private static final int HEIGHT = 600;
    private static final double PENSIZE = 0.05;

    public static void drawSet() {
        StdDraw.setPenRadius(PENSIZE);
        StdDraw.setCanvasSize(WEIGHT, HEIGHT);
        StdDraw.setXscale(0, WEIGHT);
        StdDraw.setYscale(0, HEIGHT);
    }

    public static double[][] points(int N) {
        double[][] points = new double[N][2];
        double rad = RAD / N;
        double nextRad = 0;
        for (int i = 0; i < N; i++) {
            points[i][0] = Math.cos(nextRad) * R + WEIGHT / 2;
            points[i][1] = Math.sin(nextRad) * R + HEIGHT / 2;
            nextRad += rad;
        }
        return points;
    }

    public static void drawCircle() {
        StdDraw.circle(WEIGHT / 2, HEIGHT / 2, R);
    }

    public static void drawLine(double[][] a, double p) {
        StdDraw.setPenColor(Color.GRAY);
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(a[i][0], a[i][1], a[j][0], a[j][1]);
                }
            }
        }

    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);

        drawSet();
        double[][] a = points(N);
        drawCircle();
        drawLine(a, p);
    }
}
