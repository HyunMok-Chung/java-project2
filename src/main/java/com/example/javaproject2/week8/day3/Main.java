package com.example.javaproject2.week8.day3;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String command = args[0];
            if (command.equals("add")) {

            } else if (command.equals("commit")) {

            } else {
                System.out.println("usage: add, commit");
            }
        } else {
            System.out.println("usage: add, commit");
        }

//        System.out.println("Hello World!");
//        for (String arg : args) {
//            System.out.println(arg);
//        }
//
//        String command = args[0];
//        if (command.equals("add")) {
//            System.out.println("여기에 add용 코드 작성");
//        } else if (command.equals("commit")) {
//            System.out.println("여기에 commit용 코드 작성");
//        } else {
//            System.out.println("invalid command");
//        }
    }
}
