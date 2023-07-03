package com.example.javaproject2.week12.day1;

public class Permutation {  // 순열
    public static void main(String[] args) {
        // 0 ~ 2 사이의 3개의 숫자
        // 겹치지 않도록 3개를 골라 나열한 모든 경우의 수 출력
        // 1. 첫번째 숫자를 For 반복문으로 구함
        for (int i = 0; i < 3; i++) {  // i 가 고른 첫번째 숫자
            // 2. 두번째 숫자도 반복문으로
            for (int j = 0; j < 3; j++) {  // j 가 고른 두번째 숫자
                // 만약 이미 고른 숫자라면 스킵
                if (i == j) {
                    continue;
                }
                // 세번째 숫자도 반복문으로
                for (int k = 0; k < 3; k++) {  // k 가 고른 세번쨰 숫자
                    // 이미 고른 숫자라면 스킵
                    if (k == i || k == j) {
                        continue;
                    }
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        // 0 ~ 4 의 숫자 중 3개를 골라 나열
        for (int i = 0; i < 5; i++) {
            // 0 부터 4 사이 숫자 중,
            for (int j = 0; j < 5; j++) {
                // 앞에서 선택하지 않은 숫자 선택
                if (i == j) continue;

                // 0 부터 4 사이 숫자 중,
                for (int k = 0; k < 5; k++) {
                    // 앞에서 선택하지 않은 숫자 선택
                    if (i == k || j == k) continue;
                    // 출력
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
