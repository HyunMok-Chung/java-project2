package com.example.javaproject2.week1.day4;

public class PrintfEx {
    public void print(){
        System.out.printf("%s", "Hello\n");
    }
    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx(); // PrintEx 나와라(인스턴스화)
        printfEx.print();  // printEx야 물대포를 쏴줘(메소드 호출)
    }
}
