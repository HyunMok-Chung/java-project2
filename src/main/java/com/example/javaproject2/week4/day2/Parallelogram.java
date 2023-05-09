package com.example.javaproject2.week4.day2;

import java.util.Scanner;

public class Parallelogram {
    private String spaceChar = "";

    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    // 메소드로 핵심기능 분리
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(h));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parallelogram parallelogram = new Parallelogram("*");

        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.print(parallelogram.makeALine(h, i));
        }
    }
}
