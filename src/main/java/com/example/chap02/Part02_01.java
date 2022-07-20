package com.example.chap02;

import java.util.Scanner;

//디버깅 방법
        /*
        1. 코드에서 디버깅하고자 하는 줄에 중단점을 설정한다. 이때 중단점은 여러 개 설정할 수 있다.
        2. IDE의 디버깅 기능을 실행하면 코드를 1줄씩 실행하거나 다음 중단점까지 실행할 수 있으며,
            이 과정에서 추적할 변숫값도 지정할 수 있다. 이 방법으로 변숫값이 자신이 의도한 대로 바뀌는지 파악
        3. 변숫값 이외에도 원하는 수식을 입력해 논리 오류를 파악할 수도 있다.
        * */

public class Part02_01 {
    public static void main(String[] args) {

        //자료형은 long형으로 선언

       Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int answer = 0; //초기화 오류
        int A[] = new int[100001];
        int S[] = new int[100001];
        for (int i = 1; i < 10000; i++) {  //반복 범위 잘못 지정
            A[i] = (int)(Math.random() * Integer.MAX_VALUE);
            S[i] = S[i - 1] + A[i];
        }
        for (int t = 1; t < testcase; t++) {
            int query = sc.nextInt();
            for (int i = 0; i < query; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                answer += S[end] - S[start - 1];
                System.out.println(testcase + " " + answer);
                //testcase 출력이 아닌 t를 출력
            }
        }
    }//main
}//class
