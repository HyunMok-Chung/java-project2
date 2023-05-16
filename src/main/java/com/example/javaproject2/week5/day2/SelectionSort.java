package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int j = 0; j < arr.length - 1; j++) {
            int targetValue = arr[j];
            int targetIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (targetValue > arr[i]) {
                    targetValue = arr[i];
                    targetIndex = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[targetIndex];
            arr[targetIndex] = temp;
        }


        System.out.println(Arrays.toString(arr));
    }
}
