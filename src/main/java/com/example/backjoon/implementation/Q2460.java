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
