package com.example.javaproject2.week4.day2;

import java.util.Scanner;

public class ReversePyramid {
    private String spaceChar = "0";

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    // 메소드로 핵심기능 분리
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(i), "*".repeat(2 * (h - i) - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReversePyramid reversePyramid = new ReversePyramid("*");
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.print(reversePyramid.makeALine(h, i));
        }

//        int num = sc.nextInt();
//        for (int i = num; i > 0; i--) {
//            for (int j = num - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = i * 2 - 1; k > 0; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
