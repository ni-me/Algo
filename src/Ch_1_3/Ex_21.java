package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

public class Ex_21<Item> {
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

    public boolean find(String key) {
        Node temp = first;
        boolean result = false;
        while (temp != null) {
            if (temp.item.equals(key)) {
                result = true;
                break;
            }
            temp = temp.next;
        }

        return result;
    }

    public static void main(String[] args) {
        Ex_21<String> test = new Ex_21<String>();
        test.add("Hello");
        test.add(",");
        test.add("world");
        test.add("!");
        StdOut.println(test.find("!"));
    }
}
