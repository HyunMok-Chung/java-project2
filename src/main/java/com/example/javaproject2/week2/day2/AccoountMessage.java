package com.example.javaproject2.week2.day2;

public class AccoountMessage {
    public static void main(String[] args) {
        String name = "정현목";
        int balance = 2_000_0000;
        String message = name + "님의 통장 잔고는 " + balance + "원 입니다.";
        System.out.println(message);
    }
}
