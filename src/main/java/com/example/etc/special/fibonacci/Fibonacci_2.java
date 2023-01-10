package com.example.etc.special.fibonacci;

import java.util.Scanner;

public class Fibonacci_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(fibo(N));
    }

    //피보나치 함수
    static int fibo(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;

        return fibo(N - 1) + fibo(N -2);
    }

}


/* 다른풀이

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

* */
