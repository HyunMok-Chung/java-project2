package com.example.javaproject2.week7.day1;

public class LeapYear {
    private static void checkLeapYear() {
        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "O");
        } else {
            System.out.println(year + "X");
        }
    }
    public static void main(String[] args) {
        checkLeapYear();
    }
}
