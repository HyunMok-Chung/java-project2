package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dNum1 = sc.nextInt();
        double dNum2 = sc.nextInt();
        double dNum3 = sc.nextInt();

        double answer = (dNum1 * dNum2 * dNum3) / 8 / 1024 / 1024;
        System.out.printf("%.2f MB\n", answer);
    }
}
