package com.example.javaproject2.algorithm;

import java.util.Arrays;

// 2023.06.08 (목) 버블 정렬
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {36, 12, 18, 15, 41, 19};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){  // 반복 횟수를 나타내는 몇 번째 단계인지
            for(int j = 0; j < n - 1 - i; j++){
                // 왼쪽 원소가 오른쪽 원소보다 클 경우 교환
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
