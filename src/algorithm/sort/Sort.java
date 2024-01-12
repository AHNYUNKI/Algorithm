package algorithm.sort;

public class Sort {

    /**
     * 버블 정렬
     * 구현은 간단하나, 성능이 좋지 못하다. O(n^2)
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};

        System.out.println("===== 정렬 전 =====");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        bubbleSort(arr);
        System.out.println();

        System.out.println("===== 정렬 후 =====");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
