package com.example.javaproject2.week2.day4;

public class OrExample2 {
    public static void main(String[] args) {
        int yearsOfExp = 8;
        int numOfPoj = 12;

        boolean isPromotion = yearsOfExp > 5 || numOfPoj > 10;
        System.out.printf("팀장 승진 여부: %b\n", isPromotion);
    }
}
