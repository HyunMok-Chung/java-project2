package com.example.javaproject2.week2.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimArrFillColumn {  // 열에 값 채우기
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][2] = 1;
        arr[1][2] = 1;
        arr[2][2] = 1;
        arr[3][2] = 1;
        arr[4][2] = 1;

        for(int i = 0; i < 5; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
