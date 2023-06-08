package com.example.javaproject2.week7.day1;

public class Game369 {
    public static void main(String[] args) {
//        game369();
        game369Ex();
    }
    private static void game369Ex() {
        int cnt = 333;
        String result = is369(cnt);
        System.out.println(cnt + result);
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
    private static String is369(int cnt) {
        int num1 = cnt / 10;  // 십의 자리
        int num2 = cnt % 10;  // 일의 자리
        String str = (num2 % 3 == 0 && num2 != 0) ? "*" : "";  // 삼항연산자
        if (num1 == 0) {
            return str;
        }
        return str + is369(num1);
    }
}
