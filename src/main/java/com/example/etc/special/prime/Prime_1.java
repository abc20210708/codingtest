package com.example.etc.special.prime;

import java.util.Scanner;

//참고 블로그 https://st-lab.tistory.com/81
public class Prime_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        is_prime(in.nextInt());
    }

    //소수 판별 메소드
    public static void is_prime(int num) {

        //0과 1은 소수가 아니다.
        if(num < 2) {
            System.out.println("소수가 아닙니다.");
            return;
        }

        // 2는 소수다
        if(num == 2) {
            System.out.println("소수입니다.");
            return;
        }


        for(int i = 2; i < num; i++) {

            //소수가 아닐 경우
            if(num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }

        //위 반복문에서 약수를 갖고 있지 않은 경우 -> 소수
        System.out.println("소수입니다.");
        return;

    }

}

/* 방법 1

    N보다 작은 자연수들로 모두 나눠본다.
    가장 기본적인 방법
    임의의 수 N이 1과 N을 제외한 다른 수를 약수로 갖고 있다면,
    그 수는 소수가 아니고, 만약 다른 약수가 없다면 그 수는 소수일 것이다.

    2 이상 N 미만의 수 중에 나누어 떨어지는 수가 존재한다면,
    소수가 아님을 이용한 소수 판별법이다.

    또한, 위 알고리즘의 시간복잡도는 당연히 N 이하의 수까지 모든 수를 검사하므로
    O(N)이다.

* */