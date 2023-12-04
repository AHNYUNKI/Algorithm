package coding_test.chapter_04;

public class 이상한_문자_만들기 {
    /**
     * 1. 문자열의 모든 문자에 대해 반복
     *  A. 문자가 공백 문자일 경우
     *   i. 그대로 이어 붙이기
     *   ii. 다음 등장하는 알파벳은 대문자
     *  B. 공백 문자가 아닌 경우
     *   i. 대소문자 반환하여 이어 붙이기
     *   ii. 다음 등장하는 알파벳의 대소문자는 현재 변환하는 문자와 반대
     */
    class Solution{
        public String solution(String s) {
            StringBuilder builder = new StringBuilder();
            char[] arr = s.toCharArray();
            boolean toUpper = true;

            for (char c : s.toCharArray()) {
                // c를 적절히 변환하여 builder에 추가
                if (!Character.isAlphabetic(c)) {
                    // 공백처리
                    builder.append(c);
                    toUpper = true;
                } else {
                    // 알파벳 반환
                    if (toUpper) {
                        builder.append(Character.toUpperCase(c));
                    } else {
                        builder.append(Character.toLowerCase(c));
                    }
                    toUpper = !toUpper;
                }
            }
            return builder.toString();
        }
    }
}
