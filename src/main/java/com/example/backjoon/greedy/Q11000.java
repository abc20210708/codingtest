package com.example.backjoon.greedy;

import org.springframework.security.core.parameters.P;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//강의실 배정 https://www.acmicpc.net/problem/11000
//참고 블로그 https://youngest-programming.tistory.com/505
public class Q11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); //수업

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            ///같은 시작시간일 경우 빨리 끝나는 순서대로 (끝나는 시간 오름차순)
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            else return o1[0] - o2[0]; //시작 시간 순 정렬
        });

        //강의실 개수 구하기
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            //시작 시간이 일찍 끝나는 시간보다 같거나 크다면 기존 강의실 이용
           if (!queue.isEmpty() && queue.peek() <= start) {
                queue.poll();
            }
           queue.offer(end);
        }

        System.out.println(queue.size());

    }
}
