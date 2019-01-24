package Ch_1_1;

import edu.princeton.cs.algs4.*;
public class Ex_35 {
    private static final int SIDES = 6;
    public static double[] dist() {
        double[] dist = new double[SIDES * 2 + 1];

        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i+j] += 1.0;
            }
        }
        for (int k = 2; k <= SIDES * 2; k++) {
            dist[k] /= SIDES * SIDES + 0.0;
        }
        return dist;
    }

    public static double[] experiment(int n) {
        double[] dist = new double[SIDES * 2 + 1];

        for (int i = 0; i < n; i++) {
            dist[throwDist()]++;
        }
        for (int i = 2; i <= SIDES * 2; i++ ) {
            dist[i] /= n;
        }
        return dist;
    }

    public static int throwDist() {
        return StdRandom.uniform(1, SIDES + 1) + StdRandom.uniform(1, SIDES + 1);
    }

    public static void main(String[] args) {
        double[] dist = dist();
        int n = 10000;
        for (int i = 2; i <= SIDES * 2; i++)
            StdOut.printf("%-7d", i);
        StdOut.println();

        for (int i = 2; i <= SIDES * 2; i++) {
            StdOut.printf("%-7.3f", dist[i]);
        }
        StdOut.println();

        double[] expe = experiment(n);

        for (int i = 2; i <= SIDES * 2; i++) {
            StdOut.printf("%-7.3f", expe[i]);
        }
    }
}
