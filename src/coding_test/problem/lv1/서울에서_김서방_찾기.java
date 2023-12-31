package coding_test.problem.lv1;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {

        return "김서방은 " + findNum(seoul) + "에 있다";
    }

    public int findNum(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return i;
            }
        }
        return 0;
    }
}
