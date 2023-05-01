package com.example.javaproject2.week3.day1;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 2단
        for (int j = 2; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n", j, i, j * i);
            }
            System.out.println("------------");
        }
    }
}
