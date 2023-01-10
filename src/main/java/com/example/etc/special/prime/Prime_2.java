package com.example.etc.special.prime;

import java.util.Scanner;

public class Prime_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        //0 ~ N까지 수 중 소수를 구하는 반복문
        for(int i = 0; i <= N; i++) {
            make_prime(i);
        }
    }

    public static void make_prime(int num) {

        //0과 1은 소수가 아니므로 종료
        if(num < 2) return;

        //2는 소수
        if(num == 2) {
            System.out.println(num);
            return;
        }

        for (int i = 2; i < num; i++) {

            //소수가 아닐 경우
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }

        //위 반복문에서 약수를 갖고 있지 않은 경우 소수
        System.out.println("소수입니다.");
        return;

    }

}

/* N 이하의 모든 소수를 구하는 알고리즘

위 알고리즘은 소수 판별 알고리즘을 N번 반복하여 각 수마다 소수 판별한 뒤,
소수만 출력하는 알고리즘이다.

즉 O(N) 알고리즘을 N번 반복하므로 위 방법의 N 이하의 소수를 모두 구하는
알고리즘의 시간 복잡도는 O(N^2)이다


* */