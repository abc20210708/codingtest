package com.example.part03;

import java.util.Scanner;

//03-03 투 포인터
public class Part03_006 { //006.연속된 자연수의 합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1; //count 1로 초기화 하는 이유는 N이 15일 때 숫자 15만
                       // 뽑는 경우의 수를 미리 넣고 초기화
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);

        //슈도코드 작성
        /*
        N 변수 저장
        사용 변수 초기화(count = 1, start_index = 1, end_index = 1, sum = 1)
        while(end_index != N) {
            if(sum == N) count 증가, end_index 증가, sum 변경
            else if(sum > N) sum 값 변경, start_index 증가
            else if(sum < N) end_index 증가, sum 값 변경
        }
        count 출력력
       * */
    }//main
}//class
