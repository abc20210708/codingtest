package com.example.chapter03.part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//03-02 구간 합
public class Unit003 { //003.구간 합 구하기 1
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }

        //슈도코드 작성하기
        /*
        suNo(숫자 개수), quizNo(질의 개수) 저장하기
        for( 숫자 개수만큼 반복하기) {
            합 배열 생성하기(S[i] = S[i - 1] + A[i])
        }
        for( 질의 개수만큼 반복하기) {
            구간 합 출력하기(S[j] - S[i - 1])
        }
        * */


        //합 배열 S 정의
        //S[i] = A[0] + A[1] + A[2] + ... + A[i-1] + A[i] //A[0]부터 A[i]까지의 합

        //합 배열 S를 만드는 공식
        //S[i] = S[i-1] + A[i]

        //A[2] ~ A[5] 구간 합을 합 배열로 구하는 과정
        //S[5] = A[0] + A[1] + A[2] + A[3] + A[4] + A[5]
        //S[1] = A[0] + A[1]
        //S[5] - S[1] = A[2] + A[3] + A[4] + A[5]

        /*
        * 참고 블로그 https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-11659%EB%B2%88-%EA%B5%AC%EA%B0%84-%ED%95%A9-%EA%B5%AC%ED%95%98%EA%B8%B0-4-%EC%9E%90%EB%B0%94Java
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];
        arr[0] = 0;

        for(int i = 1; i<=N; i++) arr[i] = arr[i-1] + sc.nextInt();

        for(int i = 0; i < M;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(arr[b]- arr[a-1];
            }
        *
         */
    }//main
}//class
