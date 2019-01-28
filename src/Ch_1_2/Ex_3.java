package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_3 {
    public static boolean coutain(double xlo_0, double xhi_0, double ylo_0, double yhi_0,
                                  double xlo_1, double xhi_1, double ylo_1, double yhi_1) {
        return (xlo_0 < xlo_1 && xhi_1 < xhi_0 && ylo_0 < ylo_1 && yhi_1 < yhi_0) ||
                (xlo_1 < xlo_0 && xhi_0 < xhi_1 && ylo_1 < ylo_0 && yhi_0 < yhi_1);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        //int N = 6;
        //double min = 0.0;
        //double max = 1.0;
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Interval2D[] interval = new Interval2D[N];
        double[] xlo_array = new double[N];
        double[] xhi_array = new double[N];
        double[] ylo_array = new double[N];
        double[] yhi_array = new double[N];

        for (int i = 0; i < N; i++) {
            double xlo = StdRandom.uniform(min, max);
            double xhi = StdRandom.uniform(min, max);
            double ylo = StdRandom.uniform(min, max);
            double yhi = StdRandom.uniform(min, max);


            if (xlo > xhi) {
                double temp = xlo;
                xlo = xhi;
                xhi = temp;
            }
            if (ylo > yhi) {
                double temp = ylo;
                ylo = yhi;
                yhi = temp;
            }

            xlo_array[i] = xlo;
            xhi_array[i] = xhi;
            ylo_array[i] = ylo;
            yhi_array[i] = yhi;

            Interval1D line_1 = new Interval1D(xlo, xhi);
            Interval1D line_2 = new Interval1D(ylo, yhi);
            Interval2D rect = new Interval2D(line_1, line_2);
            rect.draw();
            interval[i] = rect;
        }
        int intersects_count = 0;
        int contain_count = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval[i].intersects(interval[j])) intersects_count++;
                if (coutain(xlo_array[i], xhi_array[i], ylo_array[i], yhi_array[i],
                        xlo_array[j], xhi_array[j], ylo_array[j], yhi_array[j])) {
                    contain_count++;
                }
            }
        }
        StdOut.println("Intersects: " + intersects_count);
        StdOut.println("Contain: " + contain_count);

    }
}
