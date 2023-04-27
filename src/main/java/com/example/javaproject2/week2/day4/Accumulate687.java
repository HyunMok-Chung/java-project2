package com.example.javaproject2.week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        // 변수, 누적, 연산자, 나머지, 몫
        int num = 687;
        int answer = 0;

        // 반드시 나머지를 먼저 구하고
        answer = answer + (num % 10);
        // 그 뒤에 몫을 구해야함
        num = num / 10;

        System.out.printf("num: %d, answer: %d\n", num, answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num: %d, answer: %d\n", num, answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num: %d, answer: %d\n", num, answer);
    }
}
