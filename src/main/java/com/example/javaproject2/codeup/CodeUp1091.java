package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long result = sc.nextInt();
        int mNum = sc.nextInt();
        int addNum = sc.nextInt();
        int cnt = sc.nextInt();

        for (int i = 1; i < cnt; i++) {
            result = result * mNum + addNum;
        }
        System.out.println(result);
    }
}
