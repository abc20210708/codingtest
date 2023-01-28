package com.example.backjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//지능형 기차 2 https://www.acmicpc.net/problem/2460
public class Q2460 {
    public static void main(String[] args) throws IOException {

        BufferedReader br
            = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int[] up = new int[10];
        int[] down = new int[10];

        int person = 0;
        int max = 0;

        for (int i = 0; i < up.length; i++) {
            st =  new StringTokenizer(br.readLine());
            down[i] = Integer.parseInt(st.nextToken());
            up[i] = Integer.parseInt(st.nextToken());

            person -=  down[i];
            person +=  up[i];

            if(person > max) max = person;
        }

        System.out.println(max);

    }
}


//참고 블로그 https://velog.io/@ejung803/%EB%B0%B1%EC%A4%80-2460%EB%B2%88-%EC%A7%80%EB%8A%A5%ED%98%95-%EA%B8%B0%EC%B0%A8-2
/* 다른 풀이
 public static void main(String[] args) {
        int in, out = 0;    // in = 탄사람, out = 내린사람
        int sum = 0;    // 기차에 남아있는 사람을 저장할 변수
        int max = 0;    // 기차에 사람이 가장 많을 때의 값을 저장할 변수

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            out = sc.nextInt();
            in = sc.nextInt();

            sum = sum - out + in;

            if(max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }

* */


/* 다른 풀이 2
import java.io.*;
import java.util.StringTokenizer;

public class BJ2460 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int max = 0;

        int[][] passenger = new int[10][2];    // 2차원 배열 생성 (그래프)

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            passenger[i][0] = Integer.parseInt(st.nextToken());  // out 내리는 사람
            passenger[i][1] = Integer.parseInt(st.nextToken());  // in 타는 사람

                  sum = sum - passenger[i][0] + passenger[i][1];

            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }
 }

* */