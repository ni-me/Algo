package Ch_1_3;

import java.util.Iterator;

public class Ex_7<Item> implements Iterable<Item> {
    private int N;
    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node old_first = first;
        first = new Node();
        first.item = item;
        first.next = old_first;
        N++;
    }

    public Item pop() {
        Item temp = first.item;
        first = first.next;
        N--;
        return temp;
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

    public Item peek() {
        return first.item;
    }
}
