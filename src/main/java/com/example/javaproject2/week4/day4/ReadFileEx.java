package com.example.javaproject2.week4.day4;

import com.example.javaproject2.week4.day5.LineReader;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    LineReader lineReader;
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();


        // BufferedReader선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str) {
//        System.out.println(str);
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }
    // FileReader
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("/Users/hyunmok/Downloads/hospital_info_0920_utf8.csv"));
//        System.out.println(br.readLine());
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("hospital_info_10lines.csv");
        List<Hospital> parseHospital = rfe.getHospitals(strLines);
//        System.out.println(parseHospital.get(0));
        for (int i = 0; i < parseHospital.size(); i++) {
            Hospital hospital = parseHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
        }
    }
}
