package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 8진수 -> 10진수
        int result = Integer.parseInt(sc.next(), 8);
        System.out.printf("%d\n", result);
    }
}
