package com.example.javaproject2.programmers;

import java.util.Scanner;

public class Collatz {
    public static int solution(int num) {
        int answer = 0;
        if(num == 1)
            return 0;
        long n = num;
        while(n>1){
            answer++;
            if(answer>=500){
                answer = -1;
                break;
            }
            if(n%2 == 0){
                n /= 2;
            }else{
                n *= 3;
                n++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        System.out.println(solution(iVal));
        sc.close();
    }
}
