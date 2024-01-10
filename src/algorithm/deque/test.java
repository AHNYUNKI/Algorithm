package algorithm.deque;

public class test {
    public static void main(String[] args) {

        Deque deque = new Deque();

        System.out.println("====== addFirst =====");
        System.out.println("isEmpty : " + deque.isEmpty());
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        deque.printAll();
        System.out.println("isEmpty : " + deque.isEmpty());
        System.out.println("\n");

        System.out.println("====== removeFirst ======");
        deque.removeFirst();
        deque.printAll();
        deque.removeFirst();
        deque.printAll();
        deque.removeFirst();
        deque.printAll();
        deque.removeFirst();
        deque.printAll();
        deque.removeFirst();
        deque.printAll();
        System.out.println("isEmpty : " + deque.isEmpty());
        System.out.println("\n");

        System.out.println("===== addLast ======");
        deque.addList(1);
        deque.addList(2);
        deque.addList(3);
        deque.addList(4);
        deque.addList(5);
        deque.printAll();
        System.out.println("isEmpty : " + deque.isEmpty());
        System.out.println("\n");

        System.out.println("===== removeLast =====");
        deque.removeLast();
        deque.printAll();
        deque.removeLast();
        deque.printAll();
        deque.removeLast();
        deque.printAll();
        deque.removeLast();
        deque.printAll();
        deque.removeLast();
        deque.printAll();
        System.out.println("isEmpty : " + deque.isEmpty());

    }
}
