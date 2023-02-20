package com.example.question;

import java.util.Scanner;

public class Q01 {

    /*
    참고 블로그
    https://velog.io/@ji0_0s/Java-369%EA%B2%8C%EC%9E%84-%EC%A7%9C%EB%B3%B4%EA%B8%B0

    * 1부터 100까지의 숫자 중에
    * 1의 자리 숫자가 3,6,9인 경우에 'X'로 표시하고
    * 10단위로 줄바꿈을 하는 프로그램을 만들어보자.
    * */

    public static void main(String[] args) {

       /* for (int i = 1; i <= 100; i++) {
            String str = String.valueOf(i);
            char ch = str.charAt(str.length()-1);

            if(ch == '3' || ch == '6' || ch == '9') {
                System.out.print("X ");
                continue;
            }

            System.out.print(str + " ");

            if (ch == '0') {
                System.out.println();
            }
        }*/

        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 == 0) {
                System.out.print(i + " ");
                System.out.println();
            }
            else if((i % 10)% 3 == 0) {
                System.out.print("X ");
            } else
                System.out.print(i + " " );
        }

    } //
}
