package com.example.backjoon.new01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//참고 블로그 https://velog.io/@yeoj1n/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-9935%EB%B2%88-%EB%AC%B8%EC%9E%90%EC%97%B4-%ED%8F%AD%EB%B0%9C
//참고 블로그 https://blackvill.tistory.com/m/86
public class Q9935 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));

        String origin = br.readLine();
        String remove = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < origin.length(); i++) {
            //입력받은 문자열에서 알파벳으로 나눠서 스택에 넣기
            stack.push(origin.charAt(i));

            //스택의 사이즈가 폭발 문자열의 길이보다 길다면
            //폭발문자열이 존재할 수 있다.
            if(stack.size() >= remove.length()) {
                //폭발 문자열이 있는지를 체크하기 위한 변수
                boolean flag = true;

                //폭발 문자열의 길이만큼 반복
                for (int j = 0; j < remove.length(); j++) {
                    //스택의 길이 - 폭발 문자열의 길이를 빼고 거기부터 시작
                    //폭발 문자열과 다르면 탈출
                    if(stack.get(stack.size() - remove.length() + j) != remove.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    for (int j = 0; j < remove.length(); j++) {
                        stack.pop();
                    }
                }

            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : stack)
            sb.append(ch);


        System.out.println(sb.length() > 0 ? sb.toString() :  "FRULA");

    }
}

/*
    입력받은 문자열을 한 글자씩 stack에 넣으며 stack에 쌓인 문자열의 길이가
    폭발 문자열보다 크거나 같으면 복발 문자열을 찾아 없애는 방법

    1. stack에 입력받은 문자열을 한 글자씩 넣는다.
    2. stack에 넣은 문자열의 길이가 폭발 문자열의 길이보다 같거나 커지는 경우
       stack에서 글자를 꺼내며 폭발 문자열이 만들어지는지 확인하고
       폭발 문자열인 경우 그 길이만큼 stack에서 꺼냄
   3. stack에 남은 문자열의 길이를 체크하여 남아있는 문자의 길이가 0인 경우
        "FRULA"를 0 이상이면 문자열을 출력
* */

/*
문자열 폭발
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초 (추가 시간 없음)	128 MB	51975	12813	8973	24.669%
문제
상근이는 문자열에 폭발 문자열을 심어 놓았다. 폭발 문자열이 폭발하면 그 문자는 문자열에서 사라지며, 남은 문자열은 합쳐지게 된다.

폭발은 다음과 같은 과정으로 진행된다.

문자열이 폭발 문자열을 포함하고 있는 경우에,
모든 폭발 문자열이 폭발하게 된다.
남은 문자열을 순서대로 이어 붙여 새로운 문자열을 만든다.
새로 생긴 문자열에 폭발 문자열이 포함되어 있을 수도 있다.
폭발은 폭발 문자열이 문자열에 없을 때까지 계속된다.
상근이는 모든 폭발이 끝난 후에 어떤 문자열이 남는지 구해보려고 한다.
남아있는 문자가 없는 경우가 있다. 이때는 "FRULA"를 출력한다.

폭발 문자열은 같은 문자를 두 개 이상 포함하지 않는다.

입력
첫째 줄에 문자열이 주어진다. 문자열의 길이는 1보다 크거나 같고, 1,000,000보다 작거나 같다.

둘째 줄에 폭발 문자열이 주어진다. 길이는 1보다 크거나 같고, 36보다 작거나 같다.

두 문자열은 모두 알파벳 소문자와 대문자, 숫자 0, 1, ..., 9로만 이루어져 있다.

출력
첫째 줄에 모든 폭발이 끝난 후 남은 문자열을 출력한다.

예제 입력 1
mirkovC4nizCC44
C4
예제 출력 1
mirkovniz
예제 입력 2
12ab112ab2ab
12ab
예제 출력 2
FRULA
* */
