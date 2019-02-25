package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Ex_31<Item> implements Iterable<Item> {
    private DoubleNode<Item> first;
    private DoubleNode<Item> last;
    private int N;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void add(Item item) {
        DoubleNode<Item> next = new DoubleNode<Item>();
        next.item = item;
        if (isEmpty()) {
            first = next;
            last = next;
        } else {
            last.next = next;
            next.previous = last;
            last = next;
        }
        N++;

    }

    public Item delete() {
        Item item = last.item;
        if (last.previous == null) {
            last = null;
            first = null;
        } else {
            DoubleNode<Item> new_last = last.previous;
            new_last.next = null;
            last.previous = null;
            last = new_last;
        }
        N--;
        return item;
    }

    public void insertFirst(DoubleNode<Item> x) {
        if (isEmpty()) {
            first = x;
            last = x;
        } else {
            x.next = first;
            first.previous = x;
            first = x;
        }
        N++;
    }

    public void insertLast(DoubleNode<Item> x) {
        if (isEmpty()) {
            first = x;
            last = x;
        } else {
            last.next = x;
            x.previous = last;
            last = x;
        }
        N++;
    }

    public Item removeFirst() {
        Item item = first.item;
        if (first.next == null) {
            first = null;
            last = null;
        } else {
            DoubleNode<Item> new_first = first.next;
            first.next = null;
            new_first.previous = null;
            first = new_first;
        }
        N--;
        return item;
    }

    public Item removeLast() {
        Item item = last.item;
        if (last.previous == null) {
            first = null;
            last = null;
        } else {
            DoubleNode<Item> new_last = last.previous;
            last.previous = null;
            new_last.next = null;
            last = new_last;
        }
        N--;
        return item;
    }

    public Item remove(DoubleNode<Item> x) {
        Item item = x.item;
        if (x == first) {
            removeFirst();
        } else if (x == last) {
            removeLast();
        } else {
            DoubleNode<Item> pre = x.previous;
            DoubleNode<Item> next = x.next;
            pre.next = next;
            next.previous = pre;
            x.previous = null;
            x.next = null;
            x = null;
        }
        N--;
        return item;
    }

    public void insertBefor(DoubleNode<Item> x, DoubleNode<Item> y) {
        if (x == first) {
            insertFirst(y);
        } else {
            DoubleNode<Item> old_x_pre = x.previous;
            y.next = x;
            x.previous = y;
            old_x_pre.next = y;
            y.previous = old_x_pre;
        }
        N++;
    }

    public void insertAfter(DoubleNode<Item> x, DoubleNode<Item> y) {
        if (x == last) {
            insertLast(y);
        } else {
            DoubleNode<Item> old_x_next = x.next;
            y.previous = x;
            x.next = y;
            old_x_next.previous = y;
            y.next = old_x_next;
        }
        N++;
    }

    public Iterator<Item> iterator() {
        return new DoubleNodeListIterator();
    }

    private class DoubleNodeListIterator implements Iterator<Item> {
        private DoubleNode<Item> current = first;

        public boolean hasNext() {
            return current == null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
        }
    }

    public void showList() {
        DoubleNode<Item> temp = new DoubleNode<Item>();
        temp = first;
        while (temp != null) {
            StdOut.print(temp.item + " ");
            temp = temp.next;
        }
        StdOut.println();

    }

    public void reverseShowList() {
        DoubleNode<Item> temp = last;
        while (temp != null) {
            StdOut.print(temp.item + " ");
            temp = temp.previous;
        }
        StdOut.println();
    }

    public void testAdd() {
        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        for (int i = 0; i < a.length; i++) {
            t.add(a[i]);
        }
        t.showList();
        t.reverseShowList();
    }

    public void testDelete() {
        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        for (int i = 0; i < a.length; i++) {
            t.add(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            t.delete();
            t.showList();
        }
    }

    public void testInsertFirst() {
        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        DoubleNode<Integer> x = new DoubleNode<Integer>();
        x.item = 5;
        t.insertFirst(x);
        for (int i = 0; i < a.length; i++) t.add(a[i]);

        DoubleNode<Integer> y = new DoubleNode<Integer>();
        y.item = 6;
        t.insertFirst(y);
        t.showList();

    }

    public void testInsertLast() {
        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        DoubleNode<Integer> x = new DoubleNode<Integer>();
        x.item = 5;
        t.insertLast(x);
        for (int i = 0; i < a.length; i++) t.add(a[i]);

        DoubleNode<Integer> y = new DoubleNode<Integer>();
        y.item = 6;
        t.insertLast(y);
        t.showList();
    }

    public void testRemoveFirst() {

        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        for (int i = 0; i < a.length; i++) t.add(a[i]);
        for (int i = 0; i < a.length; i++) {
            t.removeFirst();
            t.showList();
        }
    }

    public void testRemoveLast() {

        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        for (int i = 0; i < a.length; i++) t.add(a[i]);
        for (int i = 0; i < a.length; i++) {
            t.removeLast();
            t.showList();
        }
    }

    public void testRemove() {
        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        for (int i = 0; i < a.length; i++) t.add(a[i]);
        t.remove(t.first.next);
        t.showList();
        t.remove(t.first);
        t.showList();
        t.remove(t.last);
        t.showList();
    }

    public void testInsertBefore() {
        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        for (int i = 0; i < a.length; i++) t.add(a[i]);
        DoubleNode<Integer> x = new DoubleNode<Integer>();
        DoubleNode<Integer> y = new DoubleNode<Integer>();
        DoubleNode<Integer> z = new DoubleNode<Integer>();
        x.item = 5;
        y.item = 6;
        z.item = 7;

        t.insertBefor(t.first.next, x);
        t.insertBefor(t.first, y);
        t.insertBefor(t.last, z);

        t.showList();
    }

    public void testInsertAfter() {

        int[] a = {1, 2, 3, 4};
        Ex_31<Integer> t = new Ex_31<Integer>();
        for (int i = 0; i < a.length; i++) t.add(a[i]);
        DoubleNode<Integer> x = new DoubleNode<Integer>();
        DoubleNode<Integer> y = new DoubleNode<Integer>();
        DoubleNode<Integer> z = new DoubleNode<Integer>();
        x.item = 5;
        y.item = 6;
        z.item = 7;

        t.insertAfter(t.first.next, x);
        t.insertAfter(t.first, y);
        t.insertAfter(t.last, z);

        t.showList();
    }


    public static void main(String[] args) {
        Ex_31<Integer> t = new Ex_31<Integer>();
        //t.testAdd();
        //t.testDelete();
        //t.testInsertAfter();
        //t.testInsertBefore();
        //t.testInsertFirst();
        //t.testInsertLast();
        //t.testRemove();
        //t.testRemoveFirst();
        t.testRemoveLast();
    }
}
