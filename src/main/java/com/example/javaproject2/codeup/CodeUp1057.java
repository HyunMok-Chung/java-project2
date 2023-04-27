package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        // XNOR 연산 조건
        if (iVal1 == iVal2)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
