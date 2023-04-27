package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        if (iVal1 == 0 && iVal2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
