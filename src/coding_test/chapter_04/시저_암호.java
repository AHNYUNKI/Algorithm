package coding_test.chapter_04;

public class 시저_암호 {
    /**
     * 1. 입력 문자열의 모든 문자에 대해 반복
     *  A. 알파벳이 아닌 경우 문자를 그대로 이어 붙이기
     *  B. 알파벳인 경우 n만큼 밀어 이어 붙이기
     */

    public class Solution {
        private char push(char c, int n) {
            if (!Character.isAlphabetic(c)) return c;

            // c를 n만큼 밀어 반환
            int offset = Character.isUpperCase(c) ? 'A' : 'a';
            int position = c - offset;

            position = (position + n) % ('Z' - 'A' + 1);

            return (char) (offset + position);
        }

        public String solution(String s, int n) {
            StringBuilder builder = new StringBuilder();

            for (char c : s.toCharArray()) {
                // c를 n만큼 민 문자를 builder에 이어 붙이기
                builder.append(push(c, n));
            }
            return builder.toString();

        }
    }
}
