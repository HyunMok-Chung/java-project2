package com.example.javaproject2.week6.day5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> T getFirstItem(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.run();
//        bird.makeSound();
//
//        Ani test = new Test();
//        test.makeSound();

//        Shape circle = new Circle(2);
//        System.out.println(circle.calculateArea());

//        Shape rectangle = new Rectangle(5, 10);
//        Shape circle = new Circle(3.5);
//
//        double area1 = rectangle.calculateArea();
//        double perimeter1 = rectangle.calculatePerimeter();
//
//        double area2 = circle.calculateArea();
//        double perimeter2 = circle.calculatePerimeter();
//
//        System.out.println("사각형의 넓이: " + area1);
//        System.out.println("사각형의 둘레: " + perimeter1);
//        System.out.println("원의 넓이: " + area2);
//        System.out.println("원의 둘레: " + perimeter2);

        Box<Integer> box = new Box<>();  // 제네릭 활용 방법
        box.setItem(123435345);
        System.out.println(box.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Korean");
        System.out.println(stringBox.getItem());

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        String firstItem = getFirstItem(stringList);
    }
}
