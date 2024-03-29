package com.example.doit.chapter03.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//03-02 구간 합
public class Unit004 { //004.구간 합 구하기 2
    public static void main(String[] args) throws Exception{
        //D[i][j]의 값을 채우는 구간 합 공식
        //D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[][] = new int[N + 1][N + 1];
        for (int i = 0; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int D[][] = new int[N + 1][N + 1];
        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= N; j++) {
                //구간 합 구하기
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            //구간 합 배열로 질의에 답변하기
            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 -1][y1 -1];
            System.out.println(result);
        }
    }//main
}//class
