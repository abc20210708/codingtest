package com.example.etc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

//
public class MemoTest {

    int[] arr = new int[100001]; //최댓값 100000

    public int solution(int n) {
        int result = 0;

        result = fibo(n);

        return result;
    }

    private int fibo(int n) {
        if(n < 2) return n; //0과 1은 그대로 return
        if(arr[n] != 0) return arr[n] % 1234567;

        return arr[n] = (fibo(n - 1) + fibo(n -2)) % 1234567;
    }



    public static void main(String[] args) throws IOException {
        }
}

/* 구하고자하는 피보나치 수의 최댓값이 100,000 이므로 10을 100,101 크기만큼의
   배열을 생성해두고 값을 저장하는데 사용한다.

   - 피보나치 수를 구하는 함수 작성
   피보나치 수 0 과 1의 값은 그대로 0과 1이므로 n이 2보다 작은 경우에는
   바로 n 값을 return

   만약 data 배열에 이전에 구현한 n 값이 있다면 해당 값을 1234567로
   나눈 값을 return

   처음으로 구하는 값이라면 값을 return하는 동시에 data 배열에 저장


* */














