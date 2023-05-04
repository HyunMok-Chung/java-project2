package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int xIdx = sc.nextInt() - 1;
            int yIdx = sc.nextInt() - 1;

            for (int j = 0; j < 19; j++) {
                if (arr[xIdx][i] == 0) {
                    arr[xIdx][i] = 1;
                } else {
                    arr[xIdx][i] = 0;
                }
            }

            for (int j = 0; j < 19; j++) {
                if (arr[j][yIdx] == 0) {
                    arr[j][yIdx] = 1;
                } else {
                    arr[j][yIdx] = 0;
                }
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
