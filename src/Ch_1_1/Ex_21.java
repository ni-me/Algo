package Ch_1_1;

import edu.princeton.cs.algs4.*;
public class Ex_21 {
    public static String[] readData(String name) {
        String s[] = In.readStrings(name);
        return s;
    }

    public static void main(String[] args) {
        String name = "D:/Code/Algo/src/Ch_1_1/data_21.txt";
        String[] s = readData(name);
        for (int i = 0; i < s.length; i += 3) {
            double num = Double.parseDouble(s[i+1]) / Double.parseDouble(s[i+2]);
            StdOut.printf("%-5s%-5s%-5s%-5.3f\n", s[i], s[i+1], s[i+2], num);
        }
    }
}
