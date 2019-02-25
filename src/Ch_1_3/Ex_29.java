package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

public class Ex_29<Item> {
    private int N;
    private Node last;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        if (last == null) {
            last = new Node();
            last.item = item;
            last.next = last;
        } else {
            Node temp;
            temp = last.next;
            last.next = new Node();
            last.next.item = item;
            last = last.next;
            last.next = temp;
        }
        N++;
    }

    public Item dequeue() {
        Node temp = last.next;
        Item item = temp.item;
        last.next = temp.next;
        temp.next = null;
        N--;
        return item;
    }

    public static void main(String[] args) {
        Ex_29<Integer> t = new Ex_29<Integer>();
        t.enqueue(1);
        t.enqueue(2);
        t.enqueue(3);
        t.enqueue(4);
        StdOut.println(t.dequeue());
        StdOut.println(t.dequeue());
        t.dequeue();
        t.dequeue();
        StdOut.println(t.size());
        StdOut.println(t.isEmpty());
    }
}
