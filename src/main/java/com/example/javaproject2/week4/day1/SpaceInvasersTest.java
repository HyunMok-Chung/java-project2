package com.example.javaproject2.week4.day1;

public class SpaceInvasersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        System.out.println(si.location);
        si.moveLeft();
        System.out.println(si.location);
        si.moveLeft();
        System.out.println(si.location);
        si.moveRight();
        System.out.println(si.location);
    }
}