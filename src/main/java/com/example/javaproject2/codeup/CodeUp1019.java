package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArr = str.split("\\.");
        System.out.printf("%04d.%02d.%02d\n", Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
    }
}
