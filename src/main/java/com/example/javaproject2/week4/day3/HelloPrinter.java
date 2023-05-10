package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class HelloPrinter {
    // 파일에도 저장하고 싶고
    // 콘솔에도 출력하고 싶다.

    // 인터페이스 구현체를 ClassA(HelloPrinter)에 연결
    Printer2 printer;

    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }

    //    public void print(String message) {
//        System.out.println(message);
//    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        // 생성자를 통해 ConsolePrinter 주입
        HelloPrinter hp = new HelloPrinter(new FilePrinter2());
        hp.repeatMessage(5, "Hello");
    }
}
