package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sArr = str.split(" ");

        System.out.println(Long.parseLong(sArr[0]) + Long.parseLong(sArr[1]));
    }
}
