package com.example.javaproject2.week4.day2;

public class MultiplicationTable2To4 {
    public static void printMultiplicationTable(int ofN) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n",ofN, i, ofN * i);
        }
    }
    public static void main(String[] args) {
        printMultiplicationTable(2);
        printMultiplicationTable(4);
        printMultiplicationTable(7);
        printMultiplicationTable(9);
    }
}
