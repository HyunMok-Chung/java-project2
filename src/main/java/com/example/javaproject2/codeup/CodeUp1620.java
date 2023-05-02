package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        while(true){
            int sum = 0;
            while (iVal > 0) {
                sum += iVal % 10;
                iVal /= 10;
            }
            if (sum < 10) {
                System.out.println(sum);
                break;
            }
            iVal = sum;
        }
    }
}
