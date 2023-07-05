package com.example.javaproject2.week12.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer info = new StringTokenizer(reader.readLine());
        int cardCount = Integer.parseInt(info.nextToken());
        int target = Integer.parseInt(info.nextToken());

        StringTokenizer cardTokens = new StringTokenizer(reader.readLine());
        int[] cards = new int[cardCount];
        for (int i = 0; i < cardCount; i++) {
            cards[i] = Integer.parseInt(cardTokens.nextToken());
        }

        int max = 0;
        for (int i = 0; i < cardCount - 2; i++) {
            for (int j = i + 1; j < cardCount - 1; j++) {
                for (int k = j + 1; k < cardCount; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= target && sum > max)
                        max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Main().solution());
    }
}