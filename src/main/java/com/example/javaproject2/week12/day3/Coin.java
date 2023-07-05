package com.example.javaproject2.week12.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin {  // BOJ11047
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer info = new StringTokenizer(br.readLine());
        // 동전의 종류
        int coinKinds = Integer.parseInt(info.nextToken());
        // 만들고자하는 금액
        int targetAmount = Integer.parseInt(info.nextToken());
        // 동전 금액 저장
        int[] coinAmounts = new int[coinKinds];
        // 역순 입력
        for (int i = 0; i < coinKinds; i++) {
            coinAmounts[coinKinds - i - 1] = Integer.parseInt(br.readLine());
        }

        // 실제로 사용한 동전의 갯수
        int coinUsed = 0;

        // 1. 사전적으로 풀이
//        int currentCoin = 0;
//        // 거슬러줄 금액이 남아있는 동안 반복
//        while (targetAmount > 0) {
//            if (targetAmount >= coinAmounts[currentCoin]) {
//                // 사용
//                targetAmount -= coinAmounts[currentCoin];
//                coinUsed++;
//            } else {
//                // 아니라면 다른 동전 사용
//                currentCoin++;
//            }
//        }

        // 2. 수학적 계산 풀이
        // 큰 동전부터 순서대로 확인
        for (int i = 0; i < coinKinds; i++) {
            // 남은 금액에서 현재 동전으로 지불할 수 있는 최대 갯수
            coinUsed += targetAmount / coinAmounts[i];
            // 지불하고 남은 금액 갱신
            targetAmount %= coinAmounts[i];
        }

        return coinUsed;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Coin().solution());
    }
}
