package com.example.softeer;
import java.util.*;
import java.io.*;

public class Q01 {
        public void main(String args[]) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());
            int[] bridge = new int[N];

            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<N; i++){
                bridge[i] = Integer.parseInt(st.nextToken());
            }

            // i번째 돌을 밟을 때의 최대 개수
            int[] dp = new int[N];
            for(int i=0; i<N; i++){
                dp[i] = 1;
            }
            int answer = 0; // 답

            for(int i=0; i<N; i++){
                // i번째 돌을 밟을 때의 최대 개수 탐색 시작

                for(int j=0; j<=i; j++){
                    if(bridge[i] > bridge[j]){
                        // 그 다음 돌이 현재 돌보다 높이가 높을 때
                        dp[i] = Math.max(dp[i], dp[j]+1);
                        // 현재 i번째 돌을 밟을 때의 최대 개수와 j번째 돌을 밟고 i번째 돌을 밟았을 때의 개수 중 최대값
                    }
                }
            }
            for(int i=0; i<N; i++){
                answer = Math.max(answer, dp[i]);
            }
            System.out.println(answer);
        }
    }

/* 징검다리
문제
남북으로 흐르는 개울에 동서로 징검다리가 놓여져 있다.

이 징검다리의 돌은 들쑥날쑥하여 높이가 모두 다르다.
철수는 개울의 서쪽에서 동쪽으로 높이가 점점 높은 돌을 밟으면서 개울을 지나가려고 한다.



돌의 높이가 서쪽의 돌부터 동쪽방향으로
주어졌을 때 철수가 밟을 수 있는 돌의 최대 개수는?

제약조건
1 ≤ N ≤ 3×103 인 정수

1 ≤ Ai ≤ 108 인 정수

입력형식
첫 번째 줄에 돌의 개수 N이 주어진다.

두 번째 줄에 돌의 높이 Ai (1 ≤ i ≤ N)가
서쪽부터 동쪽으로 차례로 주어진다.

출력형식
첫 번째 줄에 철수가 밟을 수 있는 돌의 최대 개수를 출력하라.
* */
