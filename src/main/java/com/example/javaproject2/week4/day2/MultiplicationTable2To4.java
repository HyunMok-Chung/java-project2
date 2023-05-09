package com.example.javaproject2.week4.day2;

public class MultiplicationTable2To4 {
    private String multipleSymbol;

    public MultiplicationTable2To4(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    // x
    public void printMultiplicationTable(int ofN) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", ofN, multipleSymbol, i, ofN * i);
        }
        System.out.println("--------------");
    }
    public static void main(String[] args) {
        MultiplicationTable2To4 mt = new MultiplicationTable2To4("x");
        mt.printMultiplicationTable(2);
        mt.printMultiplicationTable(4);
        MultiplicationTable2To4 mt2 = new MultiplicationTable2To4("*");
        mt2.printMultiplicationTable(7);
        mt2.printMultiplicationTable(9);
    }
}
