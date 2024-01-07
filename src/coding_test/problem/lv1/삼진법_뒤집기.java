package coding_test.problem.lv1;

public class 삼진법_뒤집기 {
    public int solution(int n) {
        String str = Integer.toString(n, 3); // 1200

        StringBuilder sb = new StringBuilder(str);

        return Integer.parseInt(String.valueOf(sb.reverse()), 3);

    }
}
