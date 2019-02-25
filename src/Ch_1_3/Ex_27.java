package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

public class Ex_27<Item> {
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

    public int max() {
        if (first == null) return 0;
        int max_number = Integer.parseInt(String.valueOf(first.item));
        Node<Item> temp = first;

        while (temp != null) {
            int num = Integer.parseInt(String.valueOf(temp.item));
            if (max_number < num) max_number = Integer.parseInt(String.valueOf(temp.item));
            temp = temp.next;
        }
        return max_number;
    }

    public static void main(String[] args) {
        Ex_27<Integer> t = new Ex_27<Integer>();
        t.add(4);
        t.add(3);
        t.add(3);
        t.add(3);
        t.add(5);
        StdOut.println(t.max());

    }
}
