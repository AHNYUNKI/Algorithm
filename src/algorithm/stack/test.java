package algorithm.stack;

public class test {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("====== 첫 번째 출력 =======");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop().getData());
        System.out.println(stack.pop().getData());
        System.out.println(stack.pop().getData());
        System.out.println(stack.pop().getData());

        System.out.println("====== 두 번째 출력 =======");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek().getData());
        stack.pop();
        System.out.println(stack.peek().getData());
        System.out.println("isEmpty : " + stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("isEmpty : " + stack.isEmpty());
        System.out.println(stack.pop());
    }
}
