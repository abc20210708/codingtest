package com.example.chap01.Unit000;

//시간 복잡도 활용하기
public class Part01_2 {

    //N개의 수가 주어졌을 때 이를 오름차순 정렬하는 프로그램을 작성하시오.

    //입력
    /* 1번째 줄의 개수 N(1 <= N <= 1,000,000), 2번째 줄부터는 N개의 줄에 숫자가 주어진다.
    이 수는 절댓값이 1,000,000보다 작거나 같은 정수다. 수는 중복되지 않는다.

    //출력
    1번째 줄부터 N개의 줄에 오름차순 결과를 1줄에 1개씩 출력한다.

    * */
    public static void main(String[] args) {
        //연산 횟수가 N인 경우
        int N = 100000;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수: " + cnt++);
        }

        /*
         //연산 횟수가 3N인 경우
        int N = 100000;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수: " + cnt++);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수: " + cnt++);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수: " + cnt++);
        }

        3배 차이 같지만, 코딩테스트에서 일반적으로 상수를 무시
        두 코드의 시간 복잡도는 모두 O(n)으로 같다.
        * */

        /*
        //연산 횟수가 N^인 경우
        int N = 10000;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
            System.out.println("연산 횟수: " + cnt++);
            }
        }
        시간 복잡도는 가장 많이 중첩된 반복문을 기준으로 도출


        * */


    }//main
}//class
