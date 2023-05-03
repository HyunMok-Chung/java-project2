package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vTime1 = sc.nextInt();
        int vTime2 = sc.nextInt();
        int vTime3 = sc.nextInt();
        int day = 1;

        while (true) {
            if (day % vTime1 == 0 && day % vTime2 == 0 && day % vTime3 == 0) {
                break;
            }
            day++;
        }
        System.out.println(day);
    }
}
