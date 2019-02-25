package Ch_1_3;


public class Ex_19<Item> {
    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public Item deleteLastNode() {
        Node temp = first;
        Node new_last = first;
        while (temp.next != null) {
            new_last = temp;
            temp = temp.next;
        }
        Item item = temp.item;
        new_last.next = null;
        temp = null;

        return item;
    }

}

