package codingtest_java.배열;

import java.util.Arrays;

public class 몸풀기_문제 {
    public static void main(String[] arg) {
        StringBuilder sb = new StringBuilder();

        int[] arr = {2, 1, 1, 3, 2, 5, 4};
        int[] solution = solution(arr);


        System.out.println(Arrays.toString(solution));
    }

    static int[] solution(int[] arr) {
        Arrays.sort(arr);

        return arr;
    }
}
