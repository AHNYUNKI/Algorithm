package algorithm.queue;

public class Test {
    public static void main(String[] args) {

        Queue queue = new Queue();

        System.out.println("====== enqueue() 세 번 호출 =======");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.front());

        System.out.println("====== enqueue() 세 번 호출 =======");
        System.out.println(queue.dequeue().data);
        System.out.println(queue.dequeue().data);
        System.out.println(queue.dequeue().data);
        System.out.println(queue.dequeue());

        System.out.println("isEmpty : " + queue.isEmpty());
    }
}
