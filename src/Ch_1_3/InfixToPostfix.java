package Ch_1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class InfixToPostfix {
    public String infixToPostfix() {
        String str = "";
        Stack<String> ops = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                if (ops.isEmpty()) ops.push(s);
                else if (s.equals("+") || s.equals("-")) {
                    String temp = ops.pop();
                    if (!temp.equals("(")) {
                        str += temp;
                        ops.push(s);
                    } else {
                        ops.push(temp);
                        ops.push(s);
                    }
                } else if (s.equals("*") || s.equals("/")) {
                    String temp = ops.pop();
                    if (temp.equals("*") || temp.equals("/")) {
                        str += temp;
                        ops.push(s);
                    } else {
                        ops.push(temp);
                        ops.push(s);
                    }
                }
            } else if (s.equals("(")) ops.push(s);
            else if (s.equals(")")) {
                String temp = ops.pop();
                while (!temp.equals("(")) {
                    str += temp;
                    temp = ops.pop();
                }
            } else {
                str += s;
            }
        }
        while (!ops.isEmpty()) {
            str += ops.pop();
        }
        return str;
    }

    public static void main(String[] args) {
        InfixToPostfix t = new InfixToPostfix();
        StdOut.println(t.infixToPostfix());
    }
}
