package com.example.javaproject2.week6.day5;

public class Circle implements Shape {
    // 원 넓이, 둘레 구하기 구현체
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 3.14 * 2 * radius;
    }
}
