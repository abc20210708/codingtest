package com.example.etc.special.fibonacci;
//참고 블로그 https://ivory-room.tistory.com/45
public class Fibonacci_6 {
    public int solution(int n) {
        int answer = 0;
        //n이 3일 때
        //f(3) = f(1) + f(2) = 1 + 1  = 2 이므로 숫자 초기화

        int num1 = 1;
        int num2 = 2;

        if(n == 1 || n == 2) return 1;
        else {
            for (int i = 3; i <= n; i++) {
                answer = (num1 + num2) % 1234567;
                num1 = num2; //전전수
                num2 = num1; //전수
            }
        }

        return answer;
    }
}

//재귀함수 ->시간초과
//    public static int solution(int n) {
//        if(n<2) return n;
//        else return (solution(n-1) + solution(n-2)) % 1234567;
//    }