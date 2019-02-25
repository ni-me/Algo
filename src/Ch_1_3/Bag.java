package Ch_1_3;

import edu.princeton.cs.algs4.*;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        Node old_first = first;
        first = new Node();
        first.item = item;
        first.next = old_first;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;

        }

        public void remove() {
        }
    }

}
