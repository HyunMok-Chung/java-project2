package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 16진수 -> 8진수
        String hexStr = sc.nextLine(); // String 입력
        int octNum = Integer.parseInt(hexStr, 16); // int type 16진수로 변환
        System.out.printf("%o", octNum); //서식문자 %o로 출력
    }
}
