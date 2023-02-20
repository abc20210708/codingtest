package com.example.question;

import java.util.Scanner;

public class Q01 {

    /*
    * 1부터 100까지의 숫자 중에
    * 1의 자리 숫자가 3,6,9인 경우에 'X'로 표시하고
    * 10단위로 줄바꿈을 하는 프로그램을 만들어보자.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
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
        }
    }



}
