package com.example.javaproject2.week7.day1;

public class Game369 {
    public static void main(String[] args) {
        game369();
    }
    private static void game369() {
        for (int cnt = 0; cnt < 100; cnt++) {
            System.out.print(cnt);
            int num1 = cnt / 10;  // 십의 자리
            int num2 = cnt % 10;  // 일의 자리
            if (num1 % 3 == 0 && num1 != 0) {
                System.out.print("*");
            }
            if (num2 % 3 == 0 && num2 != 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
