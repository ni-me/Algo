package Ch_1_3;

import edu.princeton.cs.algs4.*;

public class Ex_26<Item> {
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


    public void show() {
        Node<Item> temp = first;
        while (temp != null) {
            StdOut.println(temp.item);
            temp = temp.next;
        }
    }

    public void remove(Item key) {
        Node<Item> current = first;
        Node<Item> previous = first;
        while (current != null && current.equals(first)) {
            if (current.item.equals(key)) {
                first = first.next;
                current = first;
                previous = first;
            } else {
                current = current.next;
            }
        }

        while (current != null) {
            if (current.item.equals(key)) {
                previous.next = current.next;
            } else {
                previous = previous.next;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Ex_26<String> t = new Ex_26<String>();
        t.add("1");
        t.add("3");
        t.add("2");
        t.add("1");
        t.remove("1");
        t.show();
    }
}
