package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cChar = sc.next().charAt(0);

        for(char c = 'a'; c <= cChar; c++){
            System.out.printf("%c ", c);
        }
    }
}
