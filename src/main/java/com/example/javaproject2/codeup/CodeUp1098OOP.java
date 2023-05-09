package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1098OOP {
    private int[][] arr;

    public CodeUp1098OOP(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int l, int direction, int x, int y) {  // 나무 막대를 넣는 메소드
        for (int i = 0; i < l; i++) {
            if (direction == 0) {  // 가로
                arr[x - 1][y + i - 1] = 1;
            } else { // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowCnt = sc.nextInt();
        int colCnt = sc.nextInt();
        int cnt = sc.nextInt();
        CodeUp1098OOP c1098 = new CodeUp1098OOP(rowCnt, colCnt);

        for (int i = 0; i < cnt; i++) {
            int l = sc.nextInt();
            int direction = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            c1098.setBeam(l, direction, x, y);
        }
        c1098.printArr();
    }
}
