package coding_test.problem.lv1;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {

        String str1 = s.replaceAll("[^0-9]", "");

        return str1.equals(s) && (s.length() == 4 || s.length() == 6);
    }
}
