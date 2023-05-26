package com.example.javaproject2.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String brackets = "((()()))()";

        String[] split = brackets.split("\\(\\)");
        brackets = String.join("", split);// 연결해주는 메소드
        System.out.println(Arrays.toString(split));
        System.out.println(brackets);
    }
}
