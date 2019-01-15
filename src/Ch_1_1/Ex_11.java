package Ch_1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex_11 {
    public static void main(String[] args) {
        boolean[][] s = {{true,false,true,},{true,false,false,},{true,true,false}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (s[i][j]) {
                    StdOut.printf("*\t%d %d\n", i, j);
                }
                else {
                    StdOut.printf(" \t%d %d\n", i, j);
                }
            }
        }
    }
}
