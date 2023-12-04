package coding_test.problem.lv1;

public class 문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        char[] ch = s.toLowerCase().toCharArray();

        int num1 = 0, num2 = 0;
        for (char c : ch) {
            if (c == 'p'){
                num1++;
            }
            if (c == 'y') {
                num2++;
            }
        }

        return num1 == num2;
    }
}
