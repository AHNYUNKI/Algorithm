package coding_test.problem.lv1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        return deleteMin(arr);
    }

    private int[] deleteMin(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
        } else {
            int min = Arrays.stream(arr).min().getAsInt();

            arr = Arrays.stream(arr).filter(mins -> mins != min).toArray();
        }
        return arr;
    }
}
