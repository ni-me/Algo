package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

public class Ex_28<Item> {
    private Node<Item> first;
    private int max;

    public void add(Item item) {
        if (first == null) {
            first = new Node<Item>();
            first.item = item;
        } else {
            Node<Item> temp = first;
            Node<Item> new_node = new Node<Item>();
            new_node.item = item;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public int recursionMax(Node<Item> node) {
        if (node == null) return max;
        if (max < Integer.parseInt(String.valueOf(node.item))) {
            max = Integer.parseInt(String.valueOf(node.item));
        }
        return recursionMax(node.next);
    }

    public static void main(String[] args) {
        Ex_28<Integer> t = new Ex_28<Integer>();
        t.add(3);
        t.add(2);
        t.add(2);
        t.add(1);
        Node<Integer> node = t.first;
        StdOut.println(t.recursionMax(node));
    }
}
