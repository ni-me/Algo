package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

public class Ex_20<Item> {
    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        if (first == null) {
            first = new Node();
            first.item = item;
        } else {
            Node temp = first;
            Node new_node = new Node();
            new_node.item = item;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void delete(int k) {
        Node temp = first;
        Node previous = first;
        int i = 1;
        while (i < k && temp.next != null) {
            previous = temp;
            temp = temp.next;
            i++;
        }
        if (i == 1) {
            first = first.next;
        } else if (i == k) {
            previous.next = temp.next;
            temp = null;
        }
    }

    public void show() {
        Node temp = first;
        while (temp != null) {
            StdOut.println(temp.item);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Ex_20<String> test = new Ex_20<String>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");
        test.delete(7);
        test.show();
    }
}
