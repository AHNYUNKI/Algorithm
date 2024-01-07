package coding_test.problem.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int result = 0;

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            }
            result++;
        }
        return result;
    }
}
