package com.example.javaproject2.week10.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        // ArrayList LinkedList 의 성능비교
        List<Object> arrayList = new ArrayList<>();
        List<Object> linkedList = new LinkedList<>();

        System.out.println("ArrayList");
        ListComparison.rearInsert(arrayList);
        ListComparison.forntInsert(arrayList);
        ListComparison.getElements(arrayList);

        System.out.println("LinkedList");
        ListComparison.rearInsert(linkedList);
        ListComparison.forntInsert(linkedList);
        ListComparison.getElements(linkedList);
    }

    // 1. 10000개의 데이터를 리스트에 순차적으로 삽입
    public static void rearInsert(List<Object> list) {
        long start = System.nanoTime();
        // 실제로 작업하기
        long end = System.nanoTime();
        System.out.printf(String.format("순차적 추가 소요시간: %15d ns%n", end - start));
    }

    // 2. 10000개의 데이터를 리스트의 앞에 삽입
    public static void forntInsert(List<Object> list) {
        long start = System.nanoTime();
        // 실제로 작업하기
        long end = System.nanoTime();
        System.out.printf(String.format("앞쪽에 추가 소요시간: %15d ns%n", end - start));
    }

    // 3. 리스트의 모든 원소를 순서(idx)를 바탕으로 조회
    public static void getElements(List<Object> list) {
        long start = System.nanoTime();
        // 실제로 작업하기
        long end = System.nanoTime();
        System.out.printf(String.format("아이템 조회 소요시간: %15d ns%n", end - start));
    }
}
