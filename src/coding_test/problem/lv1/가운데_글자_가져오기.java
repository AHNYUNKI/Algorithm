package coding_test.problem.lv1;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        if (s.length() % 2 == 0) {
            int mid = s.length() / 2;

            return s.substring(mid-1, mid+1);

        } else {
            int mid = s.length() / 2;

            return s.substring(mid, mid+1);
        }
    }
}
