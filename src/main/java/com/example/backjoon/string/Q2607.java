package com.example.backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//참고 블로그 http://qpdh.tistory.com/98
public class Q2607 {

    //입력되는 단어의 갯수
    static int N;
    //첫 번째 단어의 26자리 알파벳 각 갯수 저장
    static int[] alphaArr;

    public static void main(String[] args) throws IOException {

        BufferedReader br =new
                BufferedReader(new InputStreamReader(System.in));

        //26자리 배열생성
        //각 알파벳마다 가진 갯수 저장
        //입력밧 마다 26자리 배열 생성
        //인덱스 값 확인
        //같거나, 차이가 1만 나는 경우 비슷한 단어로 카운트

        N = Integer.parseInt(br.readLine());

        int result = 0;

        alphaArr = new int[26];

        //첫 번째 단어 배열에 추가
        String first = br.readLine();
        for (int i = 0; i < first.length(); i++) {
            alphaArr[(first.charAt(i)) - 65]++;
        }

        //나머지 단어 처리
        for (int i = 1; i < N; i++) {
            int[] targetArr = Arrays.copyOf(alphaArr, 26);
            String target = br.readLine();

            //입력 알파벳 카운트 갱신
            for (int j = 0; j < target.length(); j++) {
                targetArr[target.charAt(j) - 65]--;
            }

            //배열 내용의 합
            int temp = 0;
            for (int j = 0; j < targetArr.length; j++) {
                temp += Math.abs(targetArr[j]);
            }

            //한 글자만 바꾸는 경우 -> 0
            //글자의 배열만 다른 경우 -> 0
            if(first.length() == target.length()) {
                if (temp == 0 || temp == 2)
                    result++;
            }

            //추가해야 같아지는 경우
            //삭제해야 같아지는 경우
            // -> 글자수가 1개 차이
            else  if(Math.abs(first.length() - target.length()) == 1) {
                if (temp == 1) result++;
            }

        }

        System.out.println(result);

    }
}


/* 비슷한 단어

문제
영문 알파벳 대문자로 이루어진 두 단어가
다음의 두 가지 조건을 만족하면 같은 구성을 갖는다고 말한다.

두 개의 단어가 같은 종류의 문자로 이루어져 있다.
같은 문자는 같은 개수 만큼 있다.
예를 들어 "DOG"와 "GOD"은 둘 다 'D', 'G', 'O'
세 종류의 문자로 이루어져 있으며 양쪽 모두 'D', 'G', 'O' 가
하나씩 있으므로 이 둘은 같은 구성을 갖는다.
하지만 "GOD"과 "GOOD"의 경우 "GOD"에는 'O'가 하나,
"GOOD"에는 'O'가 두 개 있으므로 이 둘은 다른 구성을 갖는다.

두 단어가 같은 구성을 갖는 경우, 또는 한 단어에서 한 문자를
더하거나, 빼거나, 하나의 문자를 다른 문자로 바꾸어
나머지 한 단어와 같은 구성을 갖게 되는 경우에 이들
두 단어를 서로 비슷한 단어라고 한다.

예를 들어 "DOG"와 "GOD"은 같은 구성을 가지므로 이 둘은 비슷한 단어이다.
또한 "GOD"에서 'O'를 하나 추가하면 "GOOD" 과 같은 구성을 갖게 되므로
이 둘 또한 비슷한 단어이다. 하지만 "DOG"에서 하나의 문자를 더하거나,
빼거나, 바꾸어도 "DOLL"과 같은 구성이 되지는 않으므로 "DOG"과 "DOLL"은 비슷한 단어가 아니다.

입력으로 여러 개의 서로 다른 단어가 주어질 때,
첫 번째 단어와 비슷한 단어가 모두 몇 개인지 찾아 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 단어의 개수가 주어지고 둘째 줄부터는
한 줄에 하나씩 단어가 주어진다.
모든 단어는 영문 알파벳 대문자로 이루어져 있다.
단어의 개수는 100개 이하이며, 각 단어의 길이는 10 이하이다.

출력
입력으로 주어진 첫 번째 단어와 비슷한 단어가 몇 개인지 첫째 줄에 출력한다.

예제 입력 1
4
DOG
GOD
GOOD
DOLL

* */