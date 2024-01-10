package algorithm.linked_list;

public class LinkedList {
    Node head;

    int count;

    public Node getHead() {
        return head;
    }

    public int getCount() {
        return count;
    }

    public LinkedList() {
        this.head = null;
        this.count = 0;
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
            this.head = newNode;
        } else {
            Node currentNode = this.head;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
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
            this.head = this.head.next;
            this.count--;
            return deletedNode;
        } else {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            Node deletedNode = currentNode.next;
            currentNode.next = currentNode.next.next;
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
