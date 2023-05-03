package com.example.javaproject2.week3.day3;

public class ZeroFive {
    public static boolean isZeroORFive(int num) {
        while (num > 0) {
            if (num % 10 == 5 || num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 253;
        // 10으로 나눈 나머지가 5로 나누었을 때 0 또는 5인지 check
        boolean r = isZeroORFive(num);
        System.out.println(r);
    }
}
