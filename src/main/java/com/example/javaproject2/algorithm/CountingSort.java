package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 3, 0, 5, 2, 5, 1};
        int n = arr.length;

        // counts 배열 채우기
        int[] count = new int[6];
        for (int data : arr) {
            count[data]++;
        }

        // counts 누적합
        for (int i = 0; i < 5; i++) {
            count[i + 1] += count[i];
        }
        System.out.println(Arrays.toString(count));

        // 결과 저장용 배열
        int[] output = new int[n];
        // 뒤에서부터 순회, output에 저장
        for (int i = n - 1; i >= 0; i--) {
            // 현재 데이터를 인덱스로 counts 배열의 값 회수
            count[arr[i]]--;
            int position = count[arr[i]];
            output[position] = arr[i];
        }

        System.out.println(Arrays.toString(output));
    }
}
