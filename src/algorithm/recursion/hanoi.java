package algorithm.recursion;

public class hanoi {

    public static void hanoi(int count, String from, String to, String temp) {
        if (count == 0) return;

        hanoi(count - 1, from, temp, to);
        System.out.println("원반 " + count + "를" + from + "에서" + to + "로 이동");
        hanoi(count - 1, temp, to, from);

    }

    public static void main(String[] args) {
        hanoi(3, "A", "C", "B");
    }
}
