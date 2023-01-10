package com.example.etc.special.factorial;

//참고 블로그 https://mozi.tistory.com/572
public class Factorial {
    public static void main(String[] args) {

        int result = factorial(10);
        System.out.println(result);
    }

    public static int factorial(int num) {
        if(num == 1) return 1;

        return num * factorial(num -1);
    }
}

/*
    재귀호출

    재귀호출이란 함수 내부에서 해당 함수가 다시 호출되는 것을 의미

    이러한 호출은 자기자신을 계속 호출하기 때문에 끝없이 반복될 수 있으며
    반드시 재귀호출을 중단하도록 조건 명령문을 반드시 포함해야 한다.


* */