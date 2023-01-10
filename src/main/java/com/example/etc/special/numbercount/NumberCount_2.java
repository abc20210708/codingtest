package com.example.etc.special.numbercount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCount_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(val);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - '0')]++;
        }

        for(int v : arr)
            System.out.println(v);
    }
}

/*
    BufferedReader는 문자열로 반환되니 String을 Int형으로 변환해야함
    String에서 Int로 변환하는 메소드는 Integer.parseInt()다.

    이 방법은 첫 번째 방법에 비해 알고리즘상 시간봅작도가 O(N)이라 훨씬 수행속도가 짧다.
    또한 BufferedReader 자체가 Scanner 에 비해
    우월한 성능을 지니고 있어 훨씬 좋은 performance 를 보여준다.

    알고리즘 방식은 다음과 같다.

    먼저 0부터 9까지 체크할 길이 10의 int 배열을 생성 (기본 int 배열 초기값 모두 0)
    그리고 val에 br.readLine()으로 읽은 값을 곱해서 저장
    그리고 String str에다가 val의 Int형을 String형으로 변환한 후
    for문을 통해 해당 문자열의 문자 값 - 48(또는 - '0')을 추출해
    int 배열의 index 값을 1 증가 시킨다.

    마지막으로 배열 원소에 저장된 모든 원소를 출력력

* */
