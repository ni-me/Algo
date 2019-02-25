package Ch_1_3;

import edu.princeton.cs.algs4.*;

public class Ex_25<Item> {
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

    public void insertAfter(Node<Item> front, Node<Item> behind) {
        if (front == null && behind == null) {
        } else {
            Node<Item> temp = front.next;
            front.next = behind;
            behind.next = temp;
        }
    }

    public static void main(String[] args) {
        Ex_25<String> test = new Ex_25<String>();
        Node<String> f;
        Node<String> b;
        test.add("Hello");
        test.add(",");
        test.add("World");
        test.add("!");
        f = test.first.next;

        b = new Node<String>();
        b.item = "hello";
        test.insertAfter(f, b);
        test.show();
    }
}
