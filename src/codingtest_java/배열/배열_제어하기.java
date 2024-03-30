package codingtest_java.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_제어하기 {
    public static void main(String[] arg) {

        int[] arr = {4, 2, 2, 1, 3, 4};

        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);

        Arrays.sort(result, Collections.reverseOrder());

        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
