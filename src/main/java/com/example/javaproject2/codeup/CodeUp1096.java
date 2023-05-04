package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[19][19];
        int wNum = sc.nextInt();

        for (int i = 0; i < wNum; i++) {
            int iVal1 = sc.nextInt();
            int iVal2 = sc.nextInt();

            board[iVal1 - 1][iVal2 - 1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
