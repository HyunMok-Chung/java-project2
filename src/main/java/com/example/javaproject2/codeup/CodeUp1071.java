package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1071 {  // for문을 활용한 풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for(int i = 0;;i++){
//            int iVal = sc.nextInt();
//            if(iVal == 0)
//                break;
//            System.out.println(iVal);
//        }
        // do-while 풀이
        int iVal;
        do {
            iVal = sc.nextInt();
            if(iVal != 0)
                System.out.println(iVal);
        } while (iVal == 0);
    }
}
