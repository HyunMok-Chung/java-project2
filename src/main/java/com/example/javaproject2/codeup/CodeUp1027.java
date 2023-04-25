package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] dArr = date.split("\\.");
        System.out.printf("%s-%s-%s\n", dArr[2], dArr[1], dArr[0]);
    }
}
