package com.example.javaproject2.week4.day3;

import com.example.javaproject2.week4.day2.ParallelogramShapeDrawer;
import com.example.javaproject2.week4.day2.ShapeDrawer;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int num) {
        return symbol.repeat(num);
    }

    public static String getRepeatedSymbolFor(String symbol, int num) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            answer += symbol;
        }
        return answer;
    }
    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbolFor(" ", -2 + h - i - 2), getRepeatedSymbolFor("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbolFor(" ", i - pivot), getRepeatedSymbolFor("*", 2 * (h - i) - 1));
        }
    }
    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
//            if (i <= pivot) {
//                // 피라미드 로직
//                // 초항이 3 등차가 -2
////                System.out.printf("pivot: %d, %d, %d, %d\n", pivot, i, -2 + h - i - 2, 2 * i + 1);
////                System.out.printf("%s%s\n", getRepeatedSymbol(" ", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
//                System.out.printf("%s%s\n", getRepeatedSymbolFor(" ", -2 + h - i - 2), getRepeatedSymbolFor("*", 2 * i + 1));
//            } else {
//                // 역피라미드 로직
////                System.out.printf("pivot: %d, %d, %d, %d\n", pivot, i, i - pivot, 2 * (h - i) - 1);
////                System.out.printf("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
//                System.out.printf("%s%s\n", getRepeatedSymbolFor(" ", i - pivot), getRepeatedSymbolFor("*", 2 * (h - i) - 1));
//            }
            System.out.print(makeALine(h, i));
        }
    }
}
