package com.example.javaproject2.week2.day2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "정현목";
        int balance = 10000;
        String message = String.format("%s님의 통장 잔고는 %d원 입니다.", name, balance);
        System.out.println(message);
    }
}
