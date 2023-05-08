package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < iVal * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
