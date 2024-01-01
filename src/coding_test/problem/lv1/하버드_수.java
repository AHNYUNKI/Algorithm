package coding_test.problem.lv1;

public class 하버드_수 {
    public boolean solution(int x) {

        int sum = 0;
        int num = x;

        while (num > 0) {
            sum += num % 10;
            int mok = num / 10;

            num = mok;
        }

        if (x % sum == 0) {
            return true;
        }
        return false;
    }
}
