package coding_test.problem.lv1;

public class 음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] -= (absolutes[i] * 2);
            }
            answer += absolutes[i];
        }
        return answer;
    }
}
