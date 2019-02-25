package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/*
 * reference: https://www.cnblogs.com/furzoom/p/7710191.html
 */
public class Ex_12<Item> {
    public Stack<Item> copy(Stack<Item> that) {
        Iterator<Item> it = that.iterator();
        Stack<Item> result = new Stack<Item>();
        Stack<Item> temp = new Stack<Item>();

        while (it.hasNext()) temp.push(it.next());

        it = temp.iterator();

        while (it.hasNext()) result.push(it.next());
        return result;
    }

    public static void main(String[] args) {
        Ex_12<String> t = new Ex_12<String>();
        Stack<String> that = new Stack<String>();
        that.push("Hello");
        that.push(",");
        that.push("World");
        that.push("!");
        Stack<String> cp = t.copy(that);
        for (String s : cp) {
            StdOut.print(s);
        }
    }
}
