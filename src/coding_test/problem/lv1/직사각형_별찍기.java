package coding_test.problem.lv1;

import java.util.Scanner;

public class 직사각형_별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();

        int input2 = sc.nextInt();

        for (int i = 0; i < input2; i++) {
            for (int j = 0; j < input1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
