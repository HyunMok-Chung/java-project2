package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1099OOP {
    /**
     * @method isFeed : 현재 위치에 먹이를 체크
     * @method rightBlodk : 오른쪽 길이 막혔는지 체크
     * @method downBlodk : 아래쪽 길이 막혔는지 체크
     * @method flag : 현재 위치에 9 표시
     * @method printBoard : Board 출력
     */
    public static boolean isFeed(int[][] board, int rowIndex, int columnIndex) {
        if (board[rowIndex][columnIndex] == 2) return true;
        else return false;
    }

    public static boolean rightBlock(int[][] board, int rowIndex, int columnIndex) {
        if (board[rowIndex][columnIndex + 1] == 1) return true;
        else return false;
    }

    public static boolean downBlock(int[][] board, int rowIndex, int columnIndex) {
        if (board[rowIndex + 1][columnIndex] == 1) return true;
        else return false;
    }

    public static void flag(int[][] board, int rowIndex, int columnIndex) {
        board[rowIndex][columnIndex] = 9;
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int column : row) {
                System.out.printf("%d ", column);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int rowIndex = 1;
        int columnIndex = 1;
        while (true) {
            //현재 위치에 먹이가 있는 경우 ---> flag를 세우고 break;
            if (isFeed(board, rowIndex, columnIndex)) {
                flag(board, rowIndex, columnIndex);
                break;
            }
            //오른쪽 길이 막혔고 아래쪽 길도 막힌 경우 ---> flag를 세우고 break;
            if (rightBlock(board, rowIndex, columnIndex)) {
                if (downBlock(board, rowIndex, columnIndex)) {
                    flag(board, rowIndex, columnIndex);
                    break;
                }
                //오른쪽 길이 막혔고 아래쪽 길은 열린 경우 ---> flag를 세우고 rowIndex++(아래쪽 한 칸 이동)
                else {
                    flag(board, rowIndex, columnIndex);
                    rowIndex++;
                }
            }
            //오른쪽 길이 안막힌 경우 ---> flag를 세우고 columnIndex++(오른쪽 한 칸 이동)
            else if (!rightBlock(board, rowIndex, columnIndex)) {
                flag(board, rowIndex, columnIndex);
                columnIndex++;
            }
        }
        printBoard(board);
    }
}
