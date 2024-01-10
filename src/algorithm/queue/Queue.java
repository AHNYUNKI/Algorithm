package algorithm.queue;

import algorithm.linked_list.Node;

public class Queue {
    DoublyLinkedList list;

    public Queue() {
        this.list = new DoublyLinkedList();
    }

    public void enqueue(int data) {
        this.list.insertAt(0, data);
    }

    public Node dequeue() {
        try {
            return this.list.deleteLast();
        } catch (Error e) {
            return null;
        }
    }

    public Node front() {
        return this.list.tail;
    }

    public boolean isEmpty() {
        return (this.list.count == 0);
    }
}
