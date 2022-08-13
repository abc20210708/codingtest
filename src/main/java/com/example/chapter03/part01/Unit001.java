package com.example.chapter03.part01;

import java.util.Scanner;

//03-01 배열과 리스트
public class Unit001 { // 001.숫자의 합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; //cNum[i]를 정수형으로 변환
        }
        System.out.println(sum);
    }
}//class

/*
* 배열의 특징
    1. 인덱스를 사용하여 값에 바로 접근할 수 있다.
    2. 새로운 값을 삽입하거나 특정 인덱스에 있는 값을 삭제하기 어렵다.
       값을 삭입하거나 삭제하려면 해당 인덱스 주변에 있는 값을 이동시키는 과정이 필요하다.
    3. 배열의 크기는 선언할 때 지정할 수 있으면, 한 번 선언하면 크기를 늘리거나 줄일 수 없다.
    4. 구조가 간단하므로 코딩 테스트에서 많이 사용한다.
* */

/*
*  리스트의 특징
    1. 인덱스가 없으므로 값에 전급하려면 Head 포인터부터 순서대로 접근해야 한다.
      값에 접근하는 속도가 느리다.
    2. 포인터로 연결되어 있으므로 데이터를 삽입하거나 삭제하는 연산 속도가 빠르다.
    3. 선언할 때 크기를 별도로 지정하지 않아도 된다. 다시 말해 리스트의 크기는 정해져 있지 않으며,
      크기가 변하기 쉬운 데이터를 다룰 때 적절하다.
    4. 포인터를 저장할 공간이 필요하므로 배열보다 구조가 복잡하다.

    * 참고 블로그 https://st-lab.tistory.com/61
    *
    방법 (1) Scanner 입력받아 charAt()을 사용해 푸는 방법
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //숫자의 개수 N을 입력 받는다.
        String a = sc.next(); //정수가 아닌 문자열로 입력 받는다.
        sc.close();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += a.charAt(i) - '0'; //첫번째 원소(charAt(0))부터
                                      //마지막 원소(charAt(N))까지 누적합
         }
         System.out.print(sum);

*
*/

/*  방법 (2) BufferedReader 사용, 배열을 사용하지 않고 하는 방법
        getBytes() -> 문자열에 대해 해당 문자열을 하나의 byte 배열로 변환
        BufferedReader br = new BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //N은 쓸모가 없으므로 입력만 받는다.

        int sum = 0;

        for(byte value: br.readLing().getBytes()) { //readLine()으로 읽어들인 문자를 Byte[]로
                                                    //변환하여 반환
            sum += (value - '0'); //또는 (a-48)
            }

        System.out.print(sum);


* */