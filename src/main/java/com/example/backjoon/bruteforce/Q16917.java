package com.example.backjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//양념 반 후라이드 반 https://www.acmicpc.net/problem/16917
public class Q16917 {
    public static void main(String[] args) throws IOException {

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken()) * 2;
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());


        int num = 0;
        if(A + B < C)
            num = A * X + B * Y;
        else if (A + B >= C) {
            if(X > Y) {
                int temp = X - Y;
                num = C  * Y;
                if (A > C)
                    num += C * temp;
                else
                    num += A * temp;
            } else if (Y > X) {
                int temp = Y - X;
                num = C * X;
                if (B > C)
                    num += C * temp;
                else
                    num += B * temp;
            } else {
                num = C * X;
            }
        }

        System.out.println(num);
    }
}
