package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] student = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            student[i] = sc.nextInt();
        }
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(student[i] + " ");
        }
    }
}
