package Ch_1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_9 {

    /*
     * reference:
     * https://blog.csdn.net/tubro2017/article/details/80290100
     */

    public String reConnect() {
        Stack<String> vals = new Stack<String>();
        Stack<String> ops = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                ops.push(s);
            } else if (s.equals(")")) {
                String first = vals.pop();
                String second = vals.pop();
                String str = "(" + second + ops.pop() + first + ")";
                vals.push(str);
            } else {
                vals.push(s);
            }
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        Ex_9 t = new Ex_9();
        StdOut.print(t.reConnect());
    }
}
