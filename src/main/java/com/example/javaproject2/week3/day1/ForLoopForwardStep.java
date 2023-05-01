package com.example.javaproject2.week3.day1;

public class ForLoopForwardStep {
    public static void main(String[] args) {
        // 짝수 출력
        for(int i = 0; i < 10; i += 2){
            System.out.println(i);
        }
        System.out.println("------------------");
        // 홀수 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
    }
}
