package com.example.javaproject2.week4.day1;

public class Calculator {
    public void plus() {
        System.out.println(1 + 1);
    }

    public void printPlusOne(int num) {
        System.out.println(num + 1);
    }

    public int sumOfFactors(int num) {  // 약수의 합 리턴하는 메소드
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
