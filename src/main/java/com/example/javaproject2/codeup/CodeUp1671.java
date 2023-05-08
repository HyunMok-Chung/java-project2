package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();
        int computer = sc.nextInt();

        if (user == computer) {
            System.out.println("tie");
        } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
            System.out.println("lose");
        } else {
            System.out.println("win");
        }
    }
}
