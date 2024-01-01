package coding_test.problem.lv1;

import java.util.Arrays;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        char[] ch = phone_number.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch.length - i > 4) {
                ch[i] ='*';
            }

            answer.append(ch[i]);

        }

        return answer.toString();
    }
}
