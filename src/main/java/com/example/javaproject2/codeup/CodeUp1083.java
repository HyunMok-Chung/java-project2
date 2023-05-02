package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        for (int i = 1; i <= iVal; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
