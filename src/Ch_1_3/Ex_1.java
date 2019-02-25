package Ch_1_3;

import edu.princeton.cs.algs4.*;

public class Ex_1<Item> {
    private Item[] a;
    private int N;

    public Ex_1(int cap) {
        a = (Item[]) new Object[cap];
    }

    public void push(Item item) {
        a[N++] = item;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public Item pop() {
        return a[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }
}
