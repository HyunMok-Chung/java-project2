package com.example.javaproject2.week12.day5;

import java.util.Arrays;

public class RecursiveSelectionSort {
    private void sort(int[] arr, int start) {
        if(!(start<arr.length)) return;
        int minIndex = start;
        for (int i = minIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        sort(arr, start + 1);
    }
    public static void main(String[] args) {
        int[] arr = {25, 12, 18, 24, 2, 21};

        new RecursiveSelectionSort().sort(arr, 0);

        System.out.println(Arrays.toString(arr));
    }
}
