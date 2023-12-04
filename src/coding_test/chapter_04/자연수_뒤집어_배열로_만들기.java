package coding_test.chapter_04;

public class 자연수_뒤집어_배열로_만들기 {

    /**
     * 1. 입력받은 숫자를 문자열로 변환합니다.
     * 2. 문자열을 뒤집습니다.
     * 3. 뒤집힌 문자열을 문자의 배열로 변환합니다.
     * 4. 배열의 각 문자를 정수로 변환합니다.
     */

    class Solution {
        public int[] solution(long n) {

            String str = Long.toString(n);

            String reversed = new StringBuilder(str).reverse().toString();

            char[] arr = reversed.toCharArray();

            int[] result = new int[arr.length];

            for (int i = 0; i < arr.length; i++){
                result[i] = arr[i] - '0';
            }
            return result;
        }
    }
}
