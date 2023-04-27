package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        // 삼항연산자로 숫자 3개 비교하기
        System.out.println((iVal1 < iVal2 ? iVal1 : iVal2) > iVal3 ? iVal3 : (iVal1 < iVal2 ? iVal1 : iVal2));
    }
}
