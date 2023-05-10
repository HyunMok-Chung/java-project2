package com.example.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {
    private com.example.javaproject2.week4.day3.Printer printer;

    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    // System.out --> Console
    // BufferedWriter --> Console, File
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }
//    public void printToFile() throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
//        bw.append("aaa");
//        bw.flush();
//        bw.close();
//    }

    // 출력하기
//    public void printToConsole(String[] lines) {
//        for (int i = 0; i < lines.length; i++) {
//            System.out.print(lines[i]);
//        }
//    }

    // 모양 출력하기
    public void printShape(int h) throws IOException {
        // 모양 만들기
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }
        // 모양 출력
//        printToConsole(lines);
        printer.print(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new FilePrinter());
        rtp.printShape(5);
    }
}
