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

    /**
     * 선택 정렬
     * 구현은 간단하나, 성능이 좋지 못하다. O(n^2)
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] bubble = {4, 2, 3, 1};

        System.out.println("===== 버블 정렬 전 =====");
        for (int a : bubble) {
            System.out.print(a + " ");
        }

        bubbleSort(bubble);
        System.out.println();

        System.out.println("===== 버블 정렬 후 =====");
        for (int a : bubble) {
            System.out.print(a + " ");
        }
        System.out.println();

        int[] selection = {4, 2, 3, 1};

        System.out.println("===== 선택 정렬 전 =====");
        for (int a : selection) {
            System.out.print(a + " ");
        }

        selectionSort(selection);
        System.out.println();

        System.out.println("===== 선택 정렬 후 =====");
        for (int a : selection) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
