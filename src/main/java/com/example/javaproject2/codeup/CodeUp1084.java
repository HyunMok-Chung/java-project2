package com.example.javaproject2.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = l1 * l2 * l3;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                String str = "";
                for (int k = 0; k < l3; k++) {
                    str += i +" " + j + " " + k + "\n";
                }
                bw.write(str);
                bw.flush();
            }
        }
        System.out.println(cnt);
    }
}
