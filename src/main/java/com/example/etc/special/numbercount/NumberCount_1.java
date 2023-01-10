package com.example.etc.special.numbercount;

import java.util.Scanner;
//참고 블로그 https://st-lab.tistory.com/45
public class NumberCount_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int value = (in.nextInt() * in.nextInt() * in.nextInt());
        String str = Integer.toString(value);
        System.out.println(str);
        in.close();

        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if((str.charAt(j) - '0') == i) cnt++;
            }
            System.out.println(cnt);
        }

    }
}

/*
    in.nextInt()로 입력과 동시에 곱해 value에 담는다.
    그리고 Integer.toString()메소드를 사용하여 int형을 String으로
    타입을 변환 시킨후 str에 담는다.

    첫 번째 for문은 0 ~ 9까지 각각의 수를 검사할 반복문이다.
    그리고 cnt로 개수를 카운트 하기 위한 변수를 0으로 초기화 한 후,
    이중 for문을 통해 str의 길이만큼 모든 요소를 검사 charAt()을 통해
    해당 인덱스의 문자와 i가 같은 수가 몇 개 있는지 보며
    만약 같을 경우 cnt + 1

    그리고 이중 for문이 끝나면 cnt값을 출력

    반드시 charAt()을 사용할 경우 - '0' 또는 -48을 연산해야한다.
    (아니면 아스키코드에 대응하는 문자가 나온다.)
    다만 이 알고리즘은 시간복잡도 O(N^2)이라 좋은 코드는 아니다.
* */




