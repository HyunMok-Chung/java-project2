package com.example.javaproject2.week9.day2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Infix(중위표기) -> Postfix(후위표기)로 바꾸기
public class InfixToPostfix {
    private boolean isOperator(char token) { // 연산자인지 확인하는 메소드
        return token == '(' || token == '+' || token == '-' || token == '*' || token == '/';
    }

    // 스택 내부에서의 우선순위
    private int inStackPriority(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else if (operator == '(') {
            return 0;
        } else throw new IllegalArgumentException("not allowed operator");
    }

    // 스택 외부에서의 우선순위
    private int inComingPriority(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else if (operator == '(') {
            return 3;
        } else throw new IllegalArgumentException("not allowed operator");
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 결과를 담아둘 StringBuilder
        StringBuilder sb = new StringBuilder();
        // 연산자 담는 스택 (연산자 = operator)
        Stack<Character> operStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);
            // 연산자( +, -, *, /, '(') 일때
            if (isOperator(token)) {
                // TODO 스택이 비버있다면 push (if)
                if (operStack.empty()) {
                    operStack.push(token);
                }
                // TODO 스택이 비어있지않은 경우, (else)
                else {
                    // 스택의 제일 위의 연산자가 나보다 우선순위 낮은 연산자로 올때까지 pop (while)
                    while (inStackPriority(operStack.peek()) >= inComingPriority(token)) {
                        sb.append(operStack.pop());
                        if (operStack.empty())
                            break;
                    }
                    // while 종료 후 스택에 push
                    operStack.push(token);
                }
            } else if (token == ')') {  // 닫는 괄호일때
                // TODO 스택에서 여는 괄호가 나올때까지 pop
                char top = operStack.pop();
                while (top != '(') {
                    sb.append(top);
                    top = operStack.pop();
                }
            } else {  // 숫자일 때는 바로 출력
                sb.append(token);
            }
        }
        // 연산자 스택이 빌때까지 pop
        while (!operStack.empty()) {
            sb.append(operStack.pop());
        }
        System.out.println(sb);
    }
    // 5+3*1+(4-9)*3
    public static void main(String[] args) throws IOException {
        new InfixToPostfix().solution();
    }
}
