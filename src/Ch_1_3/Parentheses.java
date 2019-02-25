package Ch_1_3;

import edu.princeton.cs.algs4.*;

public class Parentheses<Item> {
    public boolean isPair(Stack<Item> a) {
        Stack<Item> b = new Stack<Item>();
        Stack<Item> c = new Stack<Item>();

        while (!a.isEmpty()) {
            Item item = a.pop();
            if (item.equals("{") || item.equals("}") || item.equals("[") || item.equals("]")) {
                b.push(item);
            } else if (item.equals(")")) {
                item = a.pop();
                if (!item.equals("(")) return false;
            } else {
                return false;
            }
        }


        while (!b.isEmpty()) {
            Item item = b.pop();
            if (item.equals("{") || item.equals("}")) {
                c.push(item);
            } else if (item.equals("[")) {
                item = b.pop();
                if (!item.equals("]")) return false;
            } else {
                return false;
            }
        }

        while (!c.isEmpty()) {
            if (c.pop().equals("}") && c.pop().equals("{")) ;
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Stack<String> t = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            t.push(s);
        }

        for (String x : t) {
            StdOut.print(x);
        }

        StdOut.println();

        Parentheses<String> k = new Parentheses<String>();

        StdOut.print(k.isPair(t));
    }
}
