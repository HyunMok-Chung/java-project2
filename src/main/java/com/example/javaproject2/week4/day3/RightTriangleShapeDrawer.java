package com.example.javaproject2.week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer2 {
    public RightTriangleShapeDrawer(String symbol) {
        super(symbol);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer("*");
        // 추상화 : 자바의 정수
        rightTriangle.printShape(5);
    }
}
