package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n];
        for (int i=0; i<n; i++)
            student[i] = sc.nextInt();

        int min_value = 23;
        for (int i=0; i<n; i++) {
            if (min_value > student[i])
                min_value = student[i];
        }
        System.out.println(min_value);
    }
}
