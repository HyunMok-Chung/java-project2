package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int cnt = 0;
        while (iVal > 0) {
            iVal /= 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
