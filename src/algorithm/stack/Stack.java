package algorithm.stack;

import algorithm.linked_list.LinkedList;
import algorithm.linked_list.Node;

public class Stack {

    LinkedList list;

    public Stack() {
        this.list = new LinkedList();
    }

    public void push(int data) {
        this.list.insertAt(0, data);
    }

    public Node pop() {
        try {
            return this.list.deleteAt(0);

        } catch (Error e) {
            return null;
        }
    }

    public Node peek() {
        return this.list.getNodeAt(0);
    }

    public boolean isEmpty() {
        return (this.list.getCount() == 0);
    }
}
