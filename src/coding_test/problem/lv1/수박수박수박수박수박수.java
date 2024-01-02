package coding_test.problem.lv1;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
}
