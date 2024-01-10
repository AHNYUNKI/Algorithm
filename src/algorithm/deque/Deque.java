package algorithm.deque;

import algorithm.linked_list.Node;
import algorithm.queue.DoublyLinkedList;

public class Deque {
    DoublyLinkedList list;

    public Deque() {
        this.list = new DoublyLinkedList();
    }

    public void printAll() {
        this.list.printAll();
    }

    public void addFirst(int data) {
        this.list.insertAt(0, data);
    }

    public Node removeFirst() {
        return this.list.deleteAt(0);
    }

    public void addList(int data) {
        this.list.insertAt(this.list.getCount(), data);
    }

    public Node removeLast() {
        return this.list.deleteLast();
    }

    public boolean isEmpty() {
        return (this.list.getCount() == 0);
    }

}
