package com.example.javaproject2.week9.day1;

public class MyStack {
    // 스택에 실제 데이터가 저장되는 곳
    private final int[] arr = new int[16];

    // 현재 스택의 최고점을 파악하기 위한 top
    private int top = -1;

    public MyStack() {

    }

    // push
    public void push(int data) {
        if (empty()) {
            throw new RuntimeException("stack is full");
        }
        // 1. top 하나 증가
        top++;
        // 2. arr[top]에 data 할당.
        arr[top] = data;
        // 끝
    }

    // pop : 데이터를 스택의 제일 위에서 회수하는 메소드
    public int pop() {
        // 1. arr 이 비어있는지 확인
        if (empty()) {
            throw new RuntimeException("stack is empty");
        }
        // 2. arr[top]의 값을 임시 저장
        int temp = arr[top];
        // 3. top 의 값을 하나 감소
        top--;
        // 4. return temporary value;
//        return temp;
        return arr[top--];
    }

    // peek : return the top of stack without removing
    public int peek() {
        // check if stack not empty
        if (empty()) {
            throw new RuntimeException("stack is empty");
        }
        // return peek
        return arr[top];
    }

    // empty : check if stack is empty
    public boolean empty() {
        // stack is empty when top == -1
        return top == -1;
    }

    public static void main(String[] args) {
        // 스택에 3개의 데이터를 넣었다가 빼보기
        MyStack intStack = new MyStack();
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.empty());
        System.out.println(intStack.peek());
    }
}
