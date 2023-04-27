package com.example.javaproject2.week2.day4;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        // 복합 대입 연산자
        int x = 10;
        x += 1;
        System.out.printf("+=1 %d\n", x);
        x -= 5;
        System.out.printf("-= 5 %d\n", x);
        x *= 2;
        System.out.printf("*= 2 %d\n", x);
        x /= 3;
        System.out.printf("/= 3 %d\n", x);
        x %= 8;
        System.out.printf("%%= 8 %d\n", x);
    }
}
