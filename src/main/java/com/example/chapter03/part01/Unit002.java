package com.example.chapter03.part01;

import java.util.Scanner;

//03-01 배열과 리스트
public class Unit002 { //002.평균 구하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        /*
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }*/

        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp > max) max = temp;
            sum += temp;
        }
        System.out.println(sum*100.0/max/N);

        //변환 점수의 평균을 구하는 식 (점수가 A, B, C인 경우)
        //(A / M *100 + B / M *100 + C / M *100) / 3 = (A + B + C) * 100 / M / 3
    }//main
}//class
