package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = sc.nextInt();
        int dNum = sc.nextInt();
        int cnt = sc.nextInt();

        for (int i = 1; i < cnt; i++) {
            result += dNum;
        }
        System.out.println(result);
    }
}
