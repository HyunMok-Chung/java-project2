package com.example.javaproject2.week11.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AdjacentList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer : 입력받은 문자열을 ' '또는 지정 변수를 기준으로 나누어 한 단어씩 반환해주는 도구
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxNodes = Integer.parseInt(st.nextToken()); // 8
        int edges = Integer.parseInt(st.nextToken()); // 10

        // 안쪽의 List<Integer> 가 maxNodes 의 길이를 반드시 가지지는 않을 것이다.
        List<List<Integer>> adjList = new ArrayList<>();
        // 간선의 갯수만큼 반복해서 입력을 받음
        for (int i = 0; i < maxNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(st.nextToken());
            int endNode = Integer.parseInt(st.nextToken());

            adjList.get(startNode).add(endNode);
            adjList.get(endNode).add(startNode);
        }

        for (List<Integer> list : adjList) {
            Collections.sort(list);
        }
    }
}

// 정점의 갯수, 간선의 갯수
/*
8 10
0 1
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7
 */
// 10개의 줄에 걸쳐서 간선이 연결된 정점들 (간선 정보)