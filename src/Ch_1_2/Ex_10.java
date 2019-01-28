package Ch_1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex_10 {
    private final int N;
    private final int max;
    private int count;
    private int operation;

    public Ex_10(int N, int max) {
        this.N = N;
        this.max = max;
    }

    public void increase() {
        if (operation < N) {
            operation++;
            if (count < max) {
                count++;
                StdDraw.clear();
                draw();
            }
        }
    }

    public void decrease() {
        if (operation < N) {
            operation++;
            if (count > 0 - max) {
                count--;
                StdDraw.clear();
                draw();
            }
        }
    }

    public void draw() {
        StdDraw.text(0.5, 0.5, Integer.toString(count));
        StdDraw.pause(200);
    }

    public static void main(String[] args) {
        int N = 100;
        int max = 100;
        Ex_10 test = new Ex_10(N, max);
        for (int i = 0; i < N; i++) {
            if (StdRandom.uniform(0.0, 1.0) > 0.5) test.increase();
            else test.decrease();
        }
    }
}
