package Ch_1_3;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Ex_14 implements Iterable<String> {
    private String[] s;
    private int N;

    public Ex_14(int cap) {
        s = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(String item) {
        if (N == s.length) resize(2 * s.length);
        s[N++] = item;
    }

    public String dequeue() {
        String temp = s[0];
        for (int i = 0; i < N - 1; i++) {
            s[i] = s[i + 1];
        }
        s[--N] = null;
        if (N > 0 && N == s.length / 4) resize(s.length / 2);
        return temp;
    }

    private void resize(int max) {
        String[] temp = new String[max];
        for (int i = 0; i < N; i++) {
            temp[i] = s[i];
        }
        s = temp;
    }

    public Iterator<String> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<String> {

        private int i = 0;

        public boolean hasNext() {
            return i < N;
        }

        public String next() {
            return s[i++];
        }

        public void remove() {
        }
    }

    public static void main(String[] args) {
        Ex_14 test = new Ex_14(3);
        test.enqueue("It");
        test.enqueue("is");
        test.enqueue("a");
        test.enqueue("test");
        test.enqueue("message");
        test.dequeue();
        test.dequeue();

        StdOut.println(test.size());
        for (String s : test) {
            StdOut.println(s);
        }
    }
}
