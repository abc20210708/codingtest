package com.example.backjoon.new01.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1026 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        long S = 0;
        for (int i = 0; i < N; i++) {
            S += (A[i] * B[N - 1 -i]);
        }

        System.out.println(S);
    }
}

/* 다른 풀이
public class Main {

public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer arow = new StringTokenizer(br.readLine());
    StringTokenizer brow = new StringTokenizer(br.readLine());

    int[] a = new int[n];
    Integer[] b = new Integer[n];
    int s =0;

    for(int j=0; j<n; j++) {
        a[j] = Integer.parseInt(arow.nextToken());
        b[j] = Integer.parseInt(brow.nextToken());
    }

    Arrays.sort(a);     //오름차순 정렬
    Arrays.sort(b, Comparator.reverseOrder());    //내림차순 정렬

    for(int j=0; j<n; j++) {
        s += a[j]*b[j];
    }

    System.out.print(s);

}
}


* */

/*
보물
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	45499	29445	25051	67.159%
문제
옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.

길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.

S = A[0] × B[0] + ... + A[N-1] × B[N-1]

S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.

S의 최솟값을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. 둘째 줄에는 A에 있는 N개의 수가 순서대로 주어지고,
셋째 줄에는 B에 있는 수가 순서대로 주어진다. N은 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.

출력
첫째 줄에 S의 최솟값을 출력한다.

예제 입력 1
5
1 1 1 6 0
2 7 8 3 1
예제 출력 1
18
예제 입력 2
3
1 1 3
10 30 20
예제 출력 2
80
예제 입력 3
9
5 15 100 31 39 0 0 3 26
11 12 13 2 3 4 5 9 1
예제 출력 3
528
힌트
예제 1의 경우 A를 {1, 1, 0, 1, 6}과 같이 재배열하면 된다.
* */