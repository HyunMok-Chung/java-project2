package com.example.javaproject2.week6.day5;

public class Rectangle implements Shape {
    // 직사각형 넓이, 둘레 구하기 구현체
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculateArea() {
        return x * y;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (x + y);
    }
}
