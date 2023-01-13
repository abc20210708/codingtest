package com.example.backjoon.new01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] time = new int[num][2]; //시작 시간과 종료 시간 배열
        int cnt = 0; //회의 수 카운트
        int temp = 0; //이전 종료 시간 기록

        StringTokenizer st;
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        //종료 시간이 빠른 순으로 정렬, 종료 시간이 같으면 시작 시간이 빠른 순으로 정렬
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1])
                    return o1[0] - o2[0];

                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < num; i++) {
            if(temp <= time[i][0]) { //시작 시간이 이전 종료 시간과 같거나 크면 배정가능
                temp = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
