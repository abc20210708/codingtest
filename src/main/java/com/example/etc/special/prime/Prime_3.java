package com.example.etc.special.prime;

import java.util.Scanner;

public class Prime_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        // 0 ~ N까지 수 중 소수를 구하는 반복문
        for (int i = 0; i < N; i++) {
            make_prime(i);
        }
    }

    //소수 생성 메서드
    public static void make_prime(int num) {

        //0과 1은 소수가 아니므로 종료
        if(num < 2) return;

        //2는 소수
        if(num == 2) {
            System.out.println(num);
            return;
        }

        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i < Math.sqrt(num); i++) {

            //소수가 아닐 경우
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
         }

        //위 반복문에서 약수를 갖고 있지 않은 경우 소수
        System.out.println(num);
        return;

    }

}

/* " √N 이하의 자연수들로 모두 나눠본다. "

    N을 √N이하의 자연수들만 나누느 방법이다.
    임의의 자연수 N (N > 0)이 있다고 가정하자.
    p * q = N 을 만족할 때 우리는 아래와 같은 부등식을 완성할 수 있다.

    (1 <= p, q <= N)

    예를 들어 N = 16일 때
    1 * 16
    2 * 8
    4 * 4
    8 * 2
    16 * 1

    여기서 볼 수 있듯이 만약 p가 증가한다면 자연스레 q가 감소하고,
    반대로 p가 감소한다면 자연스레 q가 증가한다.

    결과적으로 p와 q 중 하나는 반드시 √N보다 작거나 같다.

    즉, √N 이하의 자연수 중에 나누어 떨어지는 수가 있다면 이는 1과 N을
    제외한 다른 자연수가 N의 약수라는 의미이므로 소수가 아니게 되는 것이다.

* */