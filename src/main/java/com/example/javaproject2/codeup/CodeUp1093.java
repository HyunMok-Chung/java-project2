package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] student = new int[24];


        for (int i = 0; i < cnt; i++) {
            int num = sc.nextInt();
            student[num-1] += 1;
        }

        for (int i = 0; i < 23; i++) {
            System.out.print(student[i] + " ");
        }
    }
}
