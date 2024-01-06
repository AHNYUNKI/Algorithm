package coding_test.problem.lv1;

public class 행렬의_덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
