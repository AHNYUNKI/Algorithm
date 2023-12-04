package coding_test.problem.basic;

public class 편지 {
    public int solution(String message) {
        char[] ch = message.trim().toCharArray();

        return ch.length * 2;
    }
}
