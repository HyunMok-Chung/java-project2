package com.example.javaproject2.week12.day5;

import java.util.Arrays;

public class ForSelectionSort {
    public static void main(String[] args) {
        int[] arr = {25, 12, 18, 24, 2, 21};
        int n = arr.length;

        // 제일 작은 원소를 찾아서 앞으로 보냄
        for (int i = 0; i < n - 1; i++) {  // i 의 값이 총 정렬된 원소의 개수
            // 제일 앞에 원소를 현재제일 작다고 설정
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // 제일 작은 숫자ㅇ를 찾음
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 제일 앞의 원소와 제일 작은 원소 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
