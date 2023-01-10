package com.example.etc.special.fibonacci;

//참고 블로그 https://marobiana.tistory.com/80
public class Fibonacci_1 {
    public static void main(String[] args) {
        //피보나치 수열을 입력 받은 숫자 개수만큼 출력

        int input = 8; //8개 출력

        for (int i = 1; i <= input; i++) {
            System.out.println(fibo(i));
        }
    }

    public static int fibo(int num) {
        if(num <= 1)
            return num;
        else
            return fibo(num - 2) + fibo(num -1);
    }

}
/*
 원리

 i              1   2   3   4

피보나치 수열     1   1   2   3



fibo(3) 이었을 때 구하는 과정을 생각해보자.
fibo(3-2) + fibo(3-1) 이었다.
즉, fibo(1) + fibo(2)

fibo(4) 였을 때는?
fibo(2) + fibo(3)  이었다.

이것을 따로 놓고 봐보자.
간단히 말하면
fibo(2) 했을 때 나온 값과, fibo(3)했을 때 나온 값을 더한게 fibo(4) 인 것이다..
프로그램 안에서 내부적으로 fibo(3), fibo(2), fibo(1).... 을
구해가기 때문에 디버깅이 복잡하지만 원리는 이것이다.


* */