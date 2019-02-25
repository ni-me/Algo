package Ch_1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EvaluatePostfix {
    public int evaluate() {
        Stack<Integer> vals = new Stack<Integer>();
        Stack<String> ops = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int firstNumber = vals.pop();
                int secondNumber = vals.pop();
                int result;
                if (s.equals("+")) result = secondNumber + firstNumber;
                else if (s.equals("-")) result = secondNumber - firstNumber;
                else if (s.equals("*")) result = secondNumber * firstNumber;
                else result = secondNumber / firstNumber;
                vals.push(result);
            } else {
                vals.push(Integer.parseInt(s));
            }
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        EvaluatePostfix t = new EvaluatePostfix();
        StdOut.println(t.evaluate());
    }
}
