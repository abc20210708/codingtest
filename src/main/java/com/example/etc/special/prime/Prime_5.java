package com.example.etc.special.prime;

import java.util.Scanner;

//소수 구하는 대표적인 방법 - 에라토스테네스의 체
//O(Nlog(log N)) 의 시간 복잡도
public class Prime_5 {

    public static boolean[] prime; //소수를 체크할 배열

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        make_prime(N);

        for (int i = 0; i < prime.length; i++) {
            if(!prime[i]) System.out.println(i);
        }

    }

    //N 이하 소수 생성 메소드
    public static void make_prime(int N) {

        prime = new boolean[N  + 1]; // 0 ~ N;

        //소수가 아닌 index =  true
        //소수인 index = false

        //2 미만의 N을 입력받으면 소수는 판별한 필요 없으므로 바로 return
        if(N < 2) return;

        prime[0] = prime[1] = true;

        //제곱근 함수 : Math.sqrt()
        for (int i = 2; i <= Math.sqrt(N) ; i++) {

            //이미 체크된 배열이면 다음으로 skip
            if(prime[i]) continue;

            //i의 배수들을 걸러주기 위한 반복문
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }


}

/* k = 2부터 √N이하까지 반복하여 자연수들 중 k를 제외한
    k의 배수들을 제외시킨다.

   k == 2이면 2를 제외한 2의 배수를 모두 지우고,
   k == 3이면 3을 제외한 3의 배수를 모두 지우고,
   (4는 이미 k == 2에서 제외되었음)
   k == 5이면 5를 제외한 5의 배수를 모두 지움 ...

   이럴헥 하여 k = √N까지 반복하는 방법


* */