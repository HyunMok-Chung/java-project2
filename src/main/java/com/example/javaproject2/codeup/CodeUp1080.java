package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < iVal; i++) {
            sum += i;
            if(sum >= iVal){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
