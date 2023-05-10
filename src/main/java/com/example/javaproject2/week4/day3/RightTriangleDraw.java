package com.example.javaproject2.week4.day3;

public class RightTriangleDraw {
    public void printShape() {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
        }
    }

    public static void main(String[] args) {
        RightTriangleDraw rtd = new RightTriangleDraw(); // Instance 생성
        rtd.printShape(); // 호출
    }
}
