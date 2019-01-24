package Ch_1_1;
import edu.princeton.cs.algs4.*;

public class Ex_33 {
    public static double dot(double[] x, double[] y) {
        double z = 0.0;
        for (int i = 0; i < x.length; i++)
            z += x[i] * y[i];
        return z;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];

        double[] x = new double[a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                x[j] = a[i][j];
            }
            c[i] = mult(x, b);
        }

        return c;
    }
    public static double[][] transpose(double[][] a) {
        double[][] b = new double[a[0].length][a.length];

        for (int  i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }


    public static double[] mult(double[][] a, double[] x) {
        double[] y = new double[a.length];

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
              y[j] += x[i] * a[j][i];
            }
        }
        return y;
    }

    public static double[] mult(double[] y, double[][] a) {
        double[] x = new double[a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                x[j] +=  y[i] * a[i][j];
            }
        }
        return x;
    }

    public static void main(String[] args){}

}
