package com.example.javaproject2.week9.day4;

// Integer To Alphabet
public class IntegerToAlpha {
    public String itoa(int value) {
        StringBuilder stringBuilder = new StringBuilder();
        while (value > 0) {
            char digitChar = (char)(value % 10 + '0');
            value /= 10;
            stringBuilder.append(digitChar);
        }

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        IntegerToAlpha integerToAlpha = new IntegerToAlpha();
        System.out.println(integerToAlpha.itoa(1234) + integerToAlpha.itoa(56789));
    }
}
