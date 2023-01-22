package com.example.programmers.lv1.v60;

//콜라 문제
//참고 블로그 https://yongku.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%BD%9C%EB%9D%BC-%EB%AC%B8%EC%A0%9C-%EC%9E%90%EB%B0%94JAVA
public class Q60 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        //빈 병의 수가 a개보다 미만일 경우
        while(n >= a) {

            answer += (n / a) * b; //마트에서 받은 콜라의 수
            int num = n % a; //남은 병을 더해서 다음에 마트갈 때 이용

            n  = (n / a) * b + num;

        }

        return answer;
    }
}

