package com.example.javaproject2.week2.day1;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        int iVal = (int)dVal;  // double 타입인 dVal를 int형으로 강제 형 변환

        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);
    }
}
