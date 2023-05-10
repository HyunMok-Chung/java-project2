package com.example.javaproject2.week4.day3;

public class DiamondShapeDrawer2 extends ShapeDrawer2 {
    public DiamondShapeDrawer2(String symbol) {
        super(symbol);
    }
    public static String getRepeatedSymbolFor(String symbol, int num) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            answer += symbol;
        }
        return answer;
    }
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbolFor(" ", -2 + h - i - 2), getRepeatedSymbolFor("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbolFor(" ", i - pivot), getRepeatedSymbolFor("*", 2 * (h - i) - 1));
        }
    }
}
