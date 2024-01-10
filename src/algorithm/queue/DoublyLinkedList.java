package algorithm.queue;

import algorithm.linked_list.Node;

public class DoublyLinkedList {
    Node head;

    int count;

    Node tail;

    public Node getHead() {
        return head;
    }

    public int getCount() {
        return count;
    }

    public DoublyLinkedList() {
        this.head = null;
        this.count = 0;
        this.tail = null;
    }
    public void printAll() {
        Node currentNode = this.head;
        String text = "[";

        while (currentNode != null) {
            text += currentNode.data;
            currentNode = currentNode.next;

            if (currentNode != null) {
                text += ", ";
            }
        }

        text += "]";
        System.out.println(text);
    }

    public void clear() {
        this.head = null;
        this.count = 0;
    }

    public void insertAt(int index, int data) {
        if (index > this.count || index < 0) {
            throw new Error("범위를 넘어갔습니다.");
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = this.head;
            if (this.head != null) {
                this.head.prev = newNode;
            }
            this.head = newNode;
        }else if (index == this.count) {
            newNode.next = null;
            newNode.prev = this.tail;
            this.tail.next = newNode;
        } else {
            Node currentNode = this.head;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            currentNode.next = newNode;
            newNode.next.prev = newNode;
        }

        if (newNode.next == null) {
            this.tail = newNode;
        }

        this.count++;
    }

    public void insertLast(int data) {
        this.insertAt(this.count, data);
    }

    public Node deleteAt(int index) {
        if (index >= this.count || index < 0) {
            throw new Error("제거할 수 없습니다.");
        }

        Node currentNode = this.head;

        if (index == 0) {
            Node deletedNode = this.head;
            if (this.head.next == null) {
                this.head = null;
                this.tail = null;
            } else {
                this.head = this.head.next;
                this.head.prev = null;
            }
            this.count--;
            return deletedNode;
        } else if (index == this.count -1) {
            Node deleteNode = this.tail;
            this.tail.prev.next = null;
            this.tail = this.tail.prev;
            this.count--;
            return deleteNode;
        } else {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            Node deletedNode = currentNode.next;
            currentNode.next = currentNode.next.next;
            currentNode.next.prev = currentNode;
            this.count--;
            return deletedNode;
        }
    }

    public Node deleteLast() {
        return this.deleteAt(this.count - 1);
    }

    public Node getNodeAt(int index) {
        if (index >= this.count || index < 0) {
            throw new Error("범위를 넘어갔습니다.");
        }

        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

}
