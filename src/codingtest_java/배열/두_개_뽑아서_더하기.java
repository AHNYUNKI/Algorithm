package codingtest_java.배열;

import java.util.Arrays;
import java.util.TreeSet;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] arg) {
        int[] arr = {2, 1, 3, 4, 1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                set.add(arr[i]+arr[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
