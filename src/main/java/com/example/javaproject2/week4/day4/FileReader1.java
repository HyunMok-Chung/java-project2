package com.example.javaproject2.week4.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

    public String[] read(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        return new String[5];
    }
    public static void main(String[] args) {
        FileReader1 fr1 = new FileReader1();

    }
}
