package com.example.backjoon.new01.q10;

import java.util.Scanner;

public class Q10808 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String target = sc.nextLine();
        int[] result = new int[26];

        for (int i = 0; i < target.length(); i++) {
            result[(int)target.charAt(i) - 97 ]++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}


/*
알파벳 개수
시간 제한	메모리 제한	제출	    정답	맞힌 사람	정답      비율
1 초	        256 MB	34502	23675	        19497	69.449%
문제
알파벳 소문자로만 이루어진 단어 S가 주어진다.
각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며,
알파벳 소문자로만 이루어져 있다.

출력
단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.

예제 입력 1
baekjoon
예제 출력 1
1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
* */