package com.example.javaproject2.week3.day4;

public class GetMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};

        // 최댓값 구하기

        int targetVal = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] > targetVal) {
                targetVal = arr[i];
            }
        }
        System.out.println(targetVal);
    }
}
