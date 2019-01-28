package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_1 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Point2D[] p = new Point2D[T];
        for (int t = 0; t < T; t++) {
            double x = Math.random();
            double y = Math.random();
            Point2D point = new Point2D(x, y);
            p[t] = point;
        }

        double shortest_distance = p[0].distanceTo(p[1]);

        for (int i = 0; i < T - 1; i++) {
            for (int j = i + 1; j < T; j++) {
                double new_distance = p[i].distanceTo(p[j]);
                if (new_distance < shortest_distance) {
                    shortest_distance = new_distance;
                }
            }
        }

        StdOut.println(shortest_distance);

    }
}
