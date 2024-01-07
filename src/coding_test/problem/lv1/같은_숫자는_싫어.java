package coding_test.problem.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class 같은_숫자는_싫어 {
//    public int[] solution(int[] arr) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(arr[0]);
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i-1] != arr[i]) {
//                list.add(arr[i]);
//            }
//        }
//
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }

    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if(stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        return stack;
    }
}
