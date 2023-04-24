package com.example.javaproject2.week2.day1;

public class DefineAVariable {
    public static void main(String[] args) {
        int num = 10;
        String name = "정현목"; // primitive 타입 쓰듯이 초기화
        String name2 = new String("정현목"); // 원래 String의 모습

        String sOne = new String("1");
        int iOne = 1;
        float fOne = 1.0f;  // float은 초기화 값 뒤에 f를 붙어줘야함 아니면 double로 인식

        System.out.printf("String: %s, Number: %d, Float: %f\n", sOne, iOne, fOne);
    }
}
