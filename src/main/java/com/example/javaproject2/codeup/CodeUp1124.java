package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String atom = sc.nextLine();
        int cAtom = Integer.parseInt(String.valueOf(atom.charAt(1)));
        int hAtom = Integer.parseInt(String.valueOf(atom.charAt(3)));

        System.out.printf("%d\n", cAtom * 12 + hAtom);
    }
}
