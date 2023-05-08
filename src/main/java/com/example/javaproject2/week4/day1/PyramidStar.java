package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        for (int i = 0; i < iVal; i++) {
            for (int j = 1; j < iVal - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
