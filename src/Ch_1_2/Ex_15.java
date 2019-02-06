package Ch_1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Ex_15 {
    public static int[] readInts(String name) {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        String name = "D:\\Code\\data\\tinyW.txt";
        int[] ints = readInts(name);
        for (int i = 0; i < ints.length; i++) {
            StdOut.println(ints[i]);
        }
    }
}
