package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String idNum = sc.nextLine();
        System.out.println(idNum.substring(0, 6) + idNum.substring(7, 14));
    }
}
