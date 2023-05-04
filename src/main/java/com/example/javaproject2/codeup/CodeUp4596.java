package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp4596 {  // 도전과제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] num = new int[9][9];
        int maxNumber = 0;
        int row = 0, column = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                num[i][j] = sc.nextInt();
                if (maxNumber < num[i][j]) {
                    maxNumber = num[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        System.out.printf("%d\n", maxNumber);
        System.out.printf("%d %d\n", row, column);
    }
}
