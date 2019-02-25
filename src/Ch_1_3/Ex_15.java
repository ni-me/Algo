package Ch_1_3;

import edu.princeton.cs.algs4.*;

public class Ex_15 {
    public static void main(String[] args) {
        Queue<String> s = new Queue<String>();

        int k = Integer.parseInt(args[0]);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            s.enqueue(item);
        }

        int l = s.size() - k;
        for (int i = 0; i < l; i++) {
            s.dequeue();
        }
        StdOut.println(s.dequeue());
    }
}


