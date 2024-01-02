package coding_test.problem.lv1;

import java.util.stream.IntStream;

public class 약수의_개수와_덧셈 {
    public int solution(int left, int right) {

        int answer = 0;

        for (int i = left; i <= right; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            answer = count % 2 == 0 ? answer + i : answer - i;
        }
        return answer;
    }
}
