package com.example.javaproject2.week6.day5;

public class Box<T> {  // 어떤 타입을 쓸지 모르기 때문에 <T>로 쓰는 것이 관례
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}
