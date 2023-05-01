package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;;i++){
            char cChar = sc.next().charAt(0);
            if(cChar == 'q') {
                System.out.println(cChar);
                break;
            }
            System.out.println(cChar);
        }
    }
}
