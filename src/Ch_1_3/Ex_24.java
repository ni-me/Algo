package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

public class Ex_24<Item> {
    private Node<Item> first;

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

    public void removeAfter(Node<Item> x) {
        if (x == null || x.next == null) return;
        Node<Item> current = x.next;
        x.next = null;
        Node<Item> next = current.next;

        while (current.next != null) {
            current = null;
            current = next;
            next = current.next;
        }
        current = null;
    }

    public void show() {
        Node temp = first;
        while (temp != null) {
            StdOut.println(temp.item);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Ex_24<String> test = new Ex_24<String>();
        test.add("Hello");
        test.add(",");
        test.add("world");
        test.add("!");
        Node<String> x = test.first.next;
        test.removeAfter(x);
        test.show();
    }
}
