package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] tArr = time.split(":");
        System.out.println(Integer.parseInt(tArr[1]));
    }
}
