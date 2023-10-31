package com.example.doit.chapter03.part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//03-02 구간 합
public class Unit003 { //003.구간 합 구하기 1
    public static void main(String[] args) throws IOException {

        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        // 입력에서 첫 줄을 읽어와서 StringTokenizer를 이용해 공백으로 분리
        StringTokenizer st =
                new StringTokenizer(br.readLine());

        // 수의 개수를 나타내는 변수 suNo와 문제의 개수를 나타내는 변수 quizNo를 읽어옴
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        // 입력으로 받은 수를 저장할 배열 S를 생성
        long[] S = new long[suNo + 1];

        // 다음 줄을 읽어와서 StringTokenizer를 이용해 공백으로 분리
        st = new StringTokenizer(br.readLine());

        // 배열 S를 구성하기 위해 누적 합을 계산
        for (int i = 0; i <= suNo; i++) {
            // 현재 인덱스까지의 누적 합을 계산하여 배열 S에 저장
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {

            // 다음 줄을 읽어와서 StringTokenizer를 이용해 공백으로 분리
            st = new StringTokenizer(br.readLine());

            // 구간의 시작과 끝을 나타내는 변수 i와 j를 읽어옴
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 배열 S를 이용하여 i부터 j까지의 구간 합을 계산하고 출력
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
