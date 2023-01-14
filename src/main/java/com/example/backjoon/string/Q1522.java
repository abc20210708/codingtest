package com.example.backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//참고 블로그 https://namhandong.tistory.com/222
public class Q1522 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int cnt = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'a') cnt++;
        }

        int min = len;
        int bCnt;

        for (int i = 0; i < len; i++) {
            bCnt = 0;
            //a의 길이만큼 +i 범위 추가로 확인
            for (int j = i; j < cnt + i; j++) {
                if (str.charAt(j % len) == 'b') bCnt++;
            }
            min = Math.min(min, bCnt);
        }
        System.out.println(min);

    }
}

/*
 a의 갯수를 구하고, 0부터 마지막까지 a의 길이만큼 돌면서 b의 교환 최소 횟수를 찾는다.
 양 끝이 연결되어 있기 때문에 마지막 인덱스까지 길이만큼 % 해줘야함


 // a와 b를 직접 교환할 필요 X
// a가 연속 = a의 개수가 모두 일렬로 있으면 됌
// a개수 다 세고, 처음부터 끝까지 a개수만큼 반복돌면서 b의 개수 카운트
// a가 7이라면 7개의 배열안에 b의 개수만큼 교환을하면 결국 a가 모두 연속 이떄 b의 값이 최소일때 답
* */

/*
문자열 교환
시간 제한	메모리 제한	제출	    정답  	맞힌 사람	정답 비율
2 초	    128 MB	    784	    381	        332	    54.248%
문제
a와 b로만 이루어진 문자열이 주어질 때,
a를 모두 연속으로 만들기 위해서 필요한 교환의 회수를 최소로 하는 프로그램을 작성하시오.

이 문자열은 원형이기 때문에, 처음과 끝은 서로 인접해 있는 것이다.

예를 들어,  aabbaaabaaba이 주어졌을 때, 2번의 교환이면 a를 모두 연속으로 만들 수 있다.

입력
첫째 줄에 문자열이 주어진다. 문자열의 길이는 최대 1,000이다.

출력
첫째 줄에 필요한 교환의 회수의 최솟값을 출력한다.

예제 입력 1
abababababababa
예제 출력 1
3
예제 입력 2
ba
예제 출력 2
0
예제 입력 3
aaaabbbbba
예제 출력 3
0
예제 입력 4
abab
예제 출력 4
1
예제 입력 5
aabbaaabaaba
예제 출력 5
2
예제 입력 6
aaaa
예제 출력 6
0
* */