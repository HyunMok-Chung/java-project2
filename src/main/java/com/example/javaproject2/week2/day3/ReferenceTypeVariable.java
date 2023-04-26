package com.example.javaproject2.week2.day3;

import com.example.javaproject2.week1.day2.PrintHello;
import com.example.javaproject2.week2.day3.Student;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        // Student 타입
        Student student = new Student();  // new를 써서 Student 인스턴스화

        Student[] students = new Student[30];

        // Object는 모든 것의 어머니. 모든 것이 다 들어갈 수 있다.
        Object obj = new Student();
        Object obj2 = new PrintHello();
    }
}
