package com.example.backjoon.new01.q01;

import java.util.Scanner;
//참고 블로그 https://st-lab.tistory.com/123
public class Q2748 {
    static long[] fiboArr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        fiboArr = new long[N +1];

        for (int i = 0; i < N +1; i++) {
            fiboArr[i] = -1;
        }

        fiboArr[0] = 0;
        fiboArr[1] = 1;

    }

    public static long Fib(int N) {
        if(fiboArr[N] == -1) {
            fiboArr[N] = Fib(N -1) + Fib(N -2);
        }
        return fiboArr[N];
    }

}
/*
문제
피보나치 수는 0과 1로 시작한다.
 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.

출력
첫째 줄에 n번째 피보나치 수를 출력한다.
* */