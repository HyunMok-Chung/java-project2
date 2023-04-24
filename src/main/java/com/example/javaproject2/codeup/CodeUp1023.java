package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] value = sc.next().split("\\.");
        int iNum1 = Integer.parseInt(value[0]);
        int iNum2 = Integer.parseInt(value[1]);

        System.out.printf("%d\n%d", iNum1, iNum2);
    }
}
