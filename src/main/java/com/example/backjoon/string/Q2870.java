package com.example.backjoon.string;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class Q2870 {
    public static void main(String[] args) throws Exception {

        //Enter 만 경계로 인식하고 받은 데이터가 String으로 고정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader눈 Reader의 하위 클래스로
        //BufferedReader 객체 생성시 파라미터로 이용가능
        //그리고 입력자치로부터 바이트 정보를 식별하기 위해
        //InputStream 중 하나인 System.in을 사용하면 된다.
        


        int N = Integer.parseInt(br.readLine());

        //범위 때문에 BigInteger 선언
        ArrayList<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            //숫자만 기고 다 자름 ( 그러나 문자는 공백으로 되어있기에 제거)
            String[] s= br.readLine().split("\\D");
            for (int j = 0; j < s.length; j++) {
                if(!s[j].equals(""))
                    list.add(new BigInteger(s[j]));
            }
            list.sort(null);//비내림차순으로 정렬
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }




    }
}

//Read한 데이터는 Line 단위로만 나눠지기에 공백단위로 데이터를 가공하려면
//1. StringTodenizer에 nextToken() 함수를 쓰면
// readLine()을 통해 입력받은 값을 공백 단위로 구분하여 순서대로 호출할 수 있다.
//2. String.split()함수를 활용해 배열에 공박단위로 끊어서 데이터를 넣고 사용하는 방식

/*
수학숙제 다국어
시간 제한	메모리 제한	제출	        정답	    맞힌 사람	정답 비율
1 초	128 MB	        5900	    1959	1537	    33.290%
문제
상근이는 수학시간에 딴 짓을 하다가 선생님께 걸렸다.
선생님은 상근이에게 이번 주말동안 반성하라며 엄청난 숙제를 내주었다.

선생님이 상근이에게 준 종이에는 숫자와 알파벳 소문자로 되어있는 글자가 N줄있다.
상근이는 여기서 숫자를 모두 찾은 뒤, 이 숫자를 비내림차순으로 정리해야한다.
숫자의 앞에 0이 있는 경우에는 정리하면서 생략할 수 있다.

글자를 살펴보다가 숫자가 나오는 경우에는, 가능한 가장 큰 숫자를 찾아야 한다.
즉, 모든 숫자의 앞과 뒤에 문자가 있거나,
줄의 시작 또는 끝이어야 한다.

예를 들어, 01a2b3456cde478에서 숫자를 찾으면 1, 2, 3456, 478이다.

선생님이 준 종이의 내용이 주어졌을 때,
상근이의 숙제를 대신하는 프로그램을 작성하시오.

입력
첫째 줄에 종이의 줄의 개수 N이 주어진다. (1 ≤ N ≤ 100)

다음 N개의 줄에는 각 줄의 내용이 주어진다. 각 줄은 최대 100글자이고,
항상 알파벳 소문자와 숫자로만 이루어져 있다.

출력
종이에서 찾은 숫자의 개수를 M이라고 하면, 출력은 M줄로 이루어져야 한다.
각 줄에는 종이에서 찾은 숫자를 하나씩 출력해야 한다.
이때, 비내림차순으로 출력해야 한다.
비내림차순은 내림차순의 반대인 경우인데,
다음 수가 앞의 수보다 크거나 같은 경우를 말한다.

예제 입력 1
2
lo3za4
01
예제 출력 1
1
3
4
예제 입력 2
4
43silos0
zita002
le2sim
231233
예제 출력 2
0
2
2
43
231233
예제 입력 3
4
01bond
02james007
03bond
04austinpowers000
예제 출력 3
0
1
2
3
4
7
* */