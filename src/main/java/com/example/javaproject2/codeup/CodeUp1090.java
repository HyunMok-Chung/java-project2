package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long result = sc.nextInt();
        int rNum = sc.nextInt();
        int cnt = sc.nextInt();

        for (int i = 1; i < cnt; i++) {
            result *= rNum;
        }
        System.out.println(result);
    }
}
