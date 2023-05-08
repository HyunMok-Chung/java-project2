package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();

        for (int i = 0; i < iNum; i++) {
            for (int j = iNum - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < iNum; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
