package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt(16);
        for(int i = 1; i < 16; i++)
        {
            System.out.printf("%X*%X=%X\n", iVal, i, iVal * i);
        }
    }
}
