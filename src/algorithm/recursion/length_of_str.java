package algorithm.recursion;

import java.util.Arrays;

public class length_of_str {
    public static int strLength(String[] arr) {
        if (arr[0] == null) {
            return 0;
        }
        String[] slicedArray = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return strLength(slicedArray) + 1;
    }

    public static void main(String[] args) {
        String str = "abcde";
        int len = str.length();

        System.out.println(len);
    }
}
