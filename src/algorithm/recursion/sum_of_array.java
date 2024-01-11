package algorithm.recursion;

import java.util.Arrays;

public class sum_of_array {
    public static int sumArray(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int[] slicedArray = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return sumArray(slicedArray) + arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumArray(arr);

        System.out.println(sum);
    }
}
