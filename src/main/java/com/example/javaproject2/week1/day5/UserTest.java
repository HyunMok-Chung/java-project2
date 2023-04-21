package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User hyunmok = new User();
        hyunmok.name = "정현목";
        hyunmok.phoneNumber = "010-0000-1234";
        hyunmok.age = 28;

        User jaesung = new User();
        jaesung.name = "재성 매니저님";
        jaesung.phoneNumber = "010-0000-1235";
        jaesung.age = 24;

        System.out.printf("%s님은 성인입니까? %s\n", hyunmok.name, hyunmok.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
