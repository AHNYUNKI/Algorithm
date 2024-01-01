package coding_test.problem.lv1;

public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int answer = 0;

        int sum = 0;

        for (int num : numbers) {
            sum += num;

            answer = 45 - sum;
        }
        return answer;
    }
}
