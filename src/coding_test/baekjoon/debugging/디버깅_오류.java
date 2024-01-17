package coding_test.baekjoon.debugging;

import java.util.Scanner;

/**
 * 오류 1. 변수 초기화 오류 찾아보기
 *
 * 오류 2. 반복문에서 인덱스 범위 지정 오류 찾아보기
 *
 * 오류 3. 잘못된 변수 사용 오류 찾아보기
 *
 * 오류 4. 자료형 범위 오류 찾아보기
 */
public class 디버깅_오류 {
    public static void main(String[] args) {
        // TODO 배열에서 주어진 범위의 합을 구하는 프로그램을 구하시오.
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int answer = 0;
        int A[] = new int[100001];
        int S[] = new int[100001];

        for (int i = 1; i < 10000; i++) {
            A[i] = (int) (Math.random() * Integer.MAX_VALUE);
            S[i] = S[i-1] + A[i];
        }
        for (int t = 1; t < testcase; t++) {
            int query = sc.nextInt();
            for (int i = 0; i < query; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                answer += S[end] - S[start - 1];
                System.out.println(testcase + " " + answer);
            }
        }
    }
}
