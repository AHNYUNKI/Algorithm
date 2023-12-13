package coding_test.problem.lv1;

public class 콜라츠_추측 {
    public int solution(int num) {
        int answer = 0;

        long num1 = num;

        if (num != 1) {
            while (num1 != 1) {
                if (num1 % 2 == 0) {
                    num1 /= 2;
                } else {
                    num1 = (num1 * 3) + 1;
                }

                answer++;

                if (answer >= 500) {
                    answer = -1;
                    num1 = 1;
                }
            }
        }
        return answer;

    }
}
