package coding_test.baekjoon.timeComplexity;

/**
 * 연산 횟수가 3N인 경우
 */
public class 시간복잡도_판별원리2 {
    public static void main(String[] args) {
        int N = 100000;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수: " + cnt++);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수: " + cnt++);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수: " + cnt++);
        }
    }
}
