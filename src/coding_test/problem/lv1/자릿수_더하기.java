package coding_test.problem.lv1;

public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;

        String[] str = String.valueOf(n).split("");

        for (String s : str) {
            answer += Integer.valueOf(s);
        }

        return answer;
    }
}
