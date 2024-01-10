package algorithm.linked_list;

public class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
