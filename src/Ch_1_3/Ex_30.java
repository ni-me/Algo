package Ch_1_3;

public class Ex_30<Item> {
    public Node<Item> reverse(Node<Item> x) {
        Node<Item> first = x;
        Node<Item> reverse = null;
        Node<Item> second = null;
        while (first != null) {
            second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }

        return reverse;
    }
}
