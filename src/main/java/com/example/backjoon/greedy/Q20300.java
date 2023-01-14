package com.example.backjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

//서강근육맨 https://www.acmicpc.net/problem/20300
public class Q20300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //배열의 길이

        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long num = 0;
        if(N % 2 == 0) {
            for (int i = 0; i < N /2; i++) {
               num = Math.max(num , arr[i] + arr[N - 1 -i]);
            }
        } else {
            num = arr[N -1];
            for (int i = 0; i < (N-1)/2; i++) {
                num = Math.max(num , arr[i] + arr[N - 2 -i]);
            }
        }

        System.out.println(num);

    }
}
