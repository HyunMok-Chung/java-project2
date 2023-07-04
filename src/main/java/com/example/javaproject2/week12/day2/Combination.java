package com.example.javaproject2.week12.day2;

public class Combination {
    public static void main(String[] args) {
        int n = 5;
        // i 는 0 부터 n - 2 까지 반복해야 안쪽 반복문에서 선택할 요소가 남는다.
        for (int i = 0; i < n - 2; i++) {
            // j 는 i + 1 부터 n - 1 까지
            for (int j = i + 1; j < n - 1; j++) {
                // k 는 j + 1 부터 n 까지
                for (int k = j + 1; k < n; k++) {
                    // 마지막 순간의 i, j, k 는 n - 2, n - 1, n이 된다.
                    System.out.printf("%d %d %d%n", i, j, k);
                }
            }
        }

        // 조합을 만들 임의의 숫자 배열
        int[] numbers = new int[]{2, 3, 5, 7, 11};
        // 반복 과정은 조합 만드는 과정과 동일하다.
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    System.out.printf(
                            "%d %d %d%n",
                            numbers[i],
                            numbers[j],
                            numbers[k]);
                }
            }
        }
    }
}
