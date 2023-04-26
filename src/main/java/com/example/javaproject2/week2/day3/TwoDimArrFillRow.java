package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {  // 행에 값 채우기
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[2][0] = 1; // 2행 0열에 값 할당
        arr[2][1] = 1; // 2행 1열에 값 할당
        arr[2][2] = 1; // 2행 2열에 값 할당
        arr[2][3] = 1; // 2행 3열에 값 할당
        arr[2][4] = 1; // 2행 4열에 값 할당

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[0]));
    }
}
