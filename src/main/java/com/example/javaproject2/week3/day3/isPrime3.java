package com.example.javaproject2.week3.day3;

public class isPrime3 {
    public static void main(String[] args) {
        // 2부터 n-1까지만 check
        // i*i <= 50
        // break; num % i == 0이면

        // 15
        int num = 991;  // 소수
        boolean isPrime = true;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
