package com.example.doit.chapter03.part02;

import java.util.Scanner;

//03-03 투 포인터 //2018
public class Unit006 { //006.연속된 자연수의 합 구하기
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
        count 출력
       * */

        /*
        참고 블로그  https://velog.io/@chw220224/%EB%B0%B1%EC%A4%80

        - N의 값 그 자체도 1연속된 숫자이므로 가지 수에 포함해야한다.
        - N/2 이상의 값을 연속시켜 더하면 N의 값을 초과해 버리므로 N/2까지만 연속해서 더해보면 된다.
            (단, 홀수의 경우를 고려해서 N/2+1까지만 계산해보자)

        - N/2+1까지만 계산했기 때문에 반복문에서 N값을 카운트하지 않았다.
        이를 고려해 count 1부터 시작, 이로 인해 생기는 예외의 경우 (N이 1, 2일 때)를 고려해
        if문을 넣어주면 쉽게 해결할 수 있다.
        */
    }//main
}//class
