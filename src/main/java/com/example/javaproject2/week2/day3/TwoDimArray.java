package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];  // 2차원 배열 선언
        int[] arr0 = arr[0];  // 2차원 배열에서 배열을 꺼내 1차원 배열이됨.(행을 꺼내온것)
        arr0[0] = 1;  // 1차원 배열인 arr0에서 천번째 칸에 값을 할당함.

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
