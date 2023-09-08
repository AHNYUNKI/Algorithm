package coding_test.chapter_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 교점에_별_만들기 {

    /**
     * 문제 풀이 흐름
     * 1. 모든 직선 쌍에 대해 반복
     *  A. 교점 좌표 구하기
     *  B. 교점 좌표만 저장
     * 2. 저장된 정수들에 대해 x, y 좌표의 최댓값, 최솟값 구하기
     * 3. 구한 최댓값, 최솟값을 이용하여 2차원 배열의 크기 결정
     * 4. 2차원 배열에 별 표시
     * 5. 문자열 배열로 변환 후 반환ㅏ
     */
    private static class Point {
        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * 교점 좌표 구하기
     */
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long) x, (long) y);
    }

    /**
     * 저장된 정수들에 대해 x,y 좌표의 최댓값 최솟값 구하기
     */
    private Point getMinimumPoint(List<Point> points) {
        // 가장 적은 좌표 찾기
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }

        return new Point(x, y);
    }

    private Point getMaximumPoint(List<Point> points) {
        // 가장 큰 좌표 찾기
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        return new Point(x, y);
    }

    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();

        // 모든 직선 쌍에 대해 반복
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {

                // 모든 정수 좌표만 저장
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);

                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        // 구한 최댓값, 최솟값을 이용하여 2차원 배열의 크기 결정
        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        // 2차원 배열에 별 표시
        for (Point p : points) {
            // 2차원 별 찍기
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }

        // 문자열 배열로 변환 후 반환
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        return result;
    }
}
