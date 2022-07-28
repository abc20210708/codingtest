package com.example.part03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//03-03 투 포인터
public class Part03_007 { //007.주몽의 명령
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0;
        int j = N -1;
        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;
            } else if (A[i] + A[j] > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }//while
        System.out.println(count);
        bf.close();

        //슈도코드
        /*
        N(재료의 개수), M(갑옷이 되는 번호) 저장하기
        for(N만큼 반복) {
         재료 배열 저장하기
        }
        재료 배열 정렬
        while( i < j) {
            if( 재료합 < M) 작은 번호 재료를 한 칸 위로 변경
            else if( 재료 합 > M) 큰 번호 재료를 한 칸 아래로 변경
            else 경우의 수 증가, 양쪽 index 각각 변경
        }
        count 출력하기
        * */
    }//main
}//class
