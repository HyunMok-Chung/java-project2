package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.printf("%d\n", num1 + num2 + num3);
        System.out.printf("%.1f", (num1 + num2 + num3) / 3.0);
    }
}
