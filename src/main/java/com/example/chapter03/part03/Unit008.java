package com.example.chapter03.part03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//03-03 투 포인터 //1253
public class Unit008 { //008. '좋은 수' 구하기
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        long A[] = new long[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        for (int k = 0; k < N; k++) {
            long find = A[k];
            int i = 0;
            int j = N - 1;
            //투 포인터 알고리즘
            while (i < j) {
                if(A[i] + A[j] == find) {
                    //find -> 서로 다른 두 수의 합이여야 함을 체크
                    if(i != k && j != k) {
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (A[i] + A[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }//while
        }//for
        System.out.println(result);
        bf.close();

        //슈도코드
        /*
        N(배열의 데이터 개수) A[N]
        배열 선언 for(N만큼 반복하기)
        {
            A 배열에 데이터 저장하기
        }
        A 배열 정렬하기

        for(N만큼 반복하기)
        {
            변수 초기화하기(찾고자 하는 값 k, 포인터 i, 포인터 j)
            while( i < j)
            {
                if(A[i] + A[j] == 찾고자 하는 값)
                    두 포인터 i, j가 k가 아닐 때 결괏값에 반영 및 while 문 종료하기
                    두 포인터 i, j가 k가 맞을 때 포인터 변경 및 계속 수행하기
                else if (k > M) 포인터 i 증가
                else 포인터 j 증가
            }
        }
        좋은 수의 개수 출력하기
        * */

        /* 참고 블로그 https://allmymight.tistory.com/97*/
    }//main
}//class
