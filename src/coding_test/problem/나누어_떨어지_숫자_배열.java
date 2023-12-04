package coding_test.problem;

import java.util.Arrays;

public class 나누어_떨어지_숫자_배열 {

    /**
     * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
     * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
     *
     * 에시
     * arr	            divisor 	return
     * [5, 9, 7, 10]	5	        [5, 10]
     * [2, 36, 1, 3]	1	    [1, 2, 3, 36]
     * [3,2,6]	10	[-1]
     */
    public class Solution {
        public int[] solution(int[] arr, int divisor) {
            int count = 0;
            int num = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    count++;
                }
            }

            if (count == 0) {
                return new int[]{-1};
            }
            int[] answer = new int[count];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[num++] = arr[i];
                }
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}
