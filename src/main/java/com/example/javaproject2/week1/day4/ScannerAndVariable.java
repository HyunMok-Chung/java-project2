package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerAndVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2와 3을 더하면 5입니다.
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1 + val2);
        System.out.printf("%d와 %d의 합은 %d입니다.\n", val1, val2, val1 + val2);
        sc.close();
    }
}
