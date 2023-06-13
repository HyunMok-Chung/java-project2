package com.example.javaproject2.week9.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Reverse Polish Notation(후기표기법) -> Postfix Notation
public class PostfixCalculation {

    public void solution() throws IOException {
        // 입력처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();  // 531*+49-3*+

        Stack<Integer> digitStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);

            // TODO 1. 숫자라면, 스택에 push
            // Character.isDigit(token) -> token 이 숫자로 표현된 글자인지 판단하는 자제 메소드
            if (Character.isDigit(token)) {
                // 숫자니까 변환 후 push
                digitStack.push(Character.digit(token, 10)); // token 을 int 형으로 변환
            } else {
                // TODO 2. 숫자가 아니라면(연산자), 스택에서 두번 pop 하고 계산
                int numRight = digitStack.pop();
                int numLeft = digitStack.pop();

                switch (token) {
                    case '+':
                        digitStack.push(numLeft + numRight);
                        break;
                    case '-':
                        digitStack.push(numLeft - numRight);
                        break;
                    case '*':
                        digitStack.push(numLeft * numRight);
                        break;
                    case '/':
                        digitStack.push(numLeft / numRight);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator");
                }
            }
        }
        int answer = digitStack.pop();

        if (digitStack.empty()) {
            System.out.println(answer);
        } else {
            System.out.println("error");
        }
    }

    public static void main(String[] args) throws IOException {
        new PostfixCalculation().solution();
    }
}
