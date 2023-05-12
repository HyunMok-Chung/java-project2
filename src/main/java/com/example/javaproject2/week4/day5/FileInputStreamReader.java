package com.example.javaproject2.week4.day5;

import java.io.*;

public class FileInputStreamReader {
    public static void main(String[] args) throws IOException {
        // InputStreamReader 사용 방법 -> Encoding 지정 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/hyunmok/Downloads/건강보험심사평가원_전국 병의원 및 약국 현황 2022.9/1.병원정보서비스 2022.10..csv"), "EUC-KR"));
        System.out.println(br.readLine());
    }
}
