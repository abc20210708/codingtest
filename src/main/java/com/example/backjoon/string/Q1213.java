package com.example.backjoon.string;

import java.util.Scanner;

//참고 블로그 https://broship.tistory.com/134?category=845145
public class Q1213 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String target = sc.nextLine();
        int size = target.length();

        int[] alp = new int[26];

        //문자열을 입력 받으며 알파벳 세기
        //아스키 코드 사용해 해당 알파벳 위치 더하기
        for (int i = 0; i < size; i++)
            alp[(int)target.charAt(i) - 65]++;

        //알파벳 갯수 중 홀수가 있다면 가운데 위치하는 것만 가능
        int center = 0;
        //홀수의 갯수 세기
        int odd = 0;
        for (int i = 0; i < 26; i++) {
            if (alp[i] % 2 != 0) {
                center = i;
                odd++;
            }
        }

        //홀수가 1개보다 많다면 만들 수 있다.
        if(odd > 1 || (odd == 1 && size % 2 == 0)) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        //홀수가 1개라면 가운데 위치시키고 양쪽을 완성시킨다.
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alp.length; i++) {
            for (int j = 0; j < alp[i]/2; j++) {
                sb.append((char)(i + 65));
            }
        }

        //알파벳을 순서대로 출력
        StringBuilder temp = new StringBuilder(sb.toString());
        if(odd == 1) //가운데 알파벳 출력
            sb.append((char)(center + 65));

        System.out.println(sb.toString() + temp.reverse());

    }

}

/*
    1. 각 알파벳 갯수를 구한다.
    2. 갯수가 홀수인 알파벳은 0이거나 1이어야 한다.
    3. 1일 경우 문자열 길이는 홀수여야 되고 해당 알파벳은 무조건 가운데 있어야 한다.
    4. 먼저 알파벳 순서대로 출력, 가운데 문자 출력, 뒤집은 알파벳을 출력력


* */


/* 팰린드롬 만들기
문제
임한수와 임문빈은 서로 사랑하는 사이이다.

임한수는 세상에서 팰린드롬인 문자열을 너무 좋아하기 때문에,
둘의 백일을 기념해서 임문빈은 팰린드롬을 선물해주려고 한다.

임문빈은 임한수의 영어 이름으로 팰린드롬을 만들려고 하는데,
임한수의 영어 이름의 알파벳 순서를 적절히 바꿔서 팰린드롬을 만들려고 한다.

임문빈을 도와 임한수의 영어 이름을 팰린드롬으로 바꾸는 프로그램을 작성하시오.

입력
첫째 줄에 임한수의 영어 이름이 있다. 알파벳 대문자로만 된 최대 50글자이다.

출력
첫째 줄에 문제의 정답을 출력한다. 만약 불가능할 때는 "I'm Sorry Hansoo"를 출력한다.
정답이 여러 개일 경우에는 사전순으로 앞서는 것을 출력한다.

예제 입력 1
AABB
예제 출력 1
ABBA
예제 입력 2
AAABB
예제 출력 2
ABABA
예제 입력 3
ABACABA
예제 출력 3
AABCBAA
예제 입력 4
ABCD
예제 출력 4
I'm Sorry Hansoo
* */