package algorithm.linked_list;

public class Node {

    public Node next;
    public int data;

    public Node prev;

    public Node(int data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

}
