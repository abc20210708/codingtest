package com.example.etc.special.prime;

import java.util.Scanner;

//소수 판별
public class Prime_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        is_prime(in.nextInt());

    }

    //소수 생성 메서드
    public static void is_prime(int num) {

        //0과 1은 소수가 아니므로 종료
        if(num < 2) return;

        //2는 소수
        if(num == 2) {
            System.out.println(num);
            return;
        }

        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(num); i++) {

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

    2 이상 √N 이하의 수 중에 나누어 떨어지는 수가 존재한다면 소수가 아님을
    이용한 소수 판별법이다.

    또한, 위 알고리즘의 시간복잡도는 당연히 √N이하의 수까지 모든 수를
    검사하므로 O(√N)이다.

* */