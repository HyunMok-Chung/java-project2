package com.example.javaproject2.week3.day4;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};

        // 최솟값 구하기

        int targetVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] < targetVal) {
                targetVal = arr[i];
            }
        }
        System.out.println(targetVal);
    }
}
