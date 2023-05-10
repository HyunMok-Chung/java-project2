package com.example.javaproject2.week4.day3;

public abstract class ShapeDrawer2 {
    protected String symbol;  // 상속자들은 사용가능
    // private으로 하면 자식 클래스에서 접근 x

    public ShapeDrawer2(String symbol) {
        this.symbol = symbol;
    }
    public abstract String makeALine(int h, int i) ; // 추상체는 구현부가 없음
    //    {
//        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
//    }
    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }
}
