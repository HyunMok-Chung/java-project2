package com.example.javaproject2.programmers;

import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i = 0; i < num2; i++){
            for(int j = 0; j < num1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
