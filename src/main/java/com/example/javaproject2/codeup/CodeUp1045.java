package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d\n", num1 + num2);
        System.out.printf("%d\n", num1 - num2);
        System.out.printf("%d\n", num1 * num2);
        System.out.printf("%d\n", num1 / num2);
        System.out.printf("%d\n", num1 % num2);
        System.out.printf("%.2f\n", (float)num1 / num2);
    }
}
