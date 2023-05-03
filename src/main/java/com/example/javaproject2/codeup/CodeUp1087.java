package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int sum = 0;
        int cnt = 1;
        while (true) {
            sum += cnt;
            if (sum >= iVal) {
                break;
            }
            cnt++;
        }
        System.out.println(sum);
    }
}
