package com.example.javaproject2.week4.day1;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("김미미");
        user1.setAge(14);

        User user2 = new User();
        user2.setName("김나나");
        user2.setAge(37);

        System.out.printf("%s는 성인입니까? %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 성인입니까? %b\n", user2.getName(), user2.isAdult());
    }
}
