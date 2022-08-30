package com.example.chapter03.part05;

import java.io.*;
import java.util.Stack;

//03-05 스택과 큐 //17298
public class Unit012 { //012.오큰수 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] A = new int[n]; //수열 배열 생성
        int[] ans = new int[n]; //정답 배열 생성
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0); //처음에는 항상 스택이 비어 있으므로 최초 값을 push애 초기화
        for (int i = 0; i < n; i++) {
            //스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우

            /*
            스택이 비어있지 않으면서
            현재 원소가 스택의 맨 위 원소보다 큰 경우
            해당 조건을 만족할 때까지 스택의 원소를 pop 하면서
            해당 인덱스의 값을 현재 원소로 바꿔준다
            * */
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                ans[myStack.pop()] = A[i]; //정답 배열에 오큰수를 현재 수열로 저장하기
            }
            myStack.push(i); //신규 데이터 push
        }
        while (!myStack.empty()) {
            //반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 때까지
            ans[myStack.pop()] = -1;
            //스택에 쌓인 index에 -1로 초기화
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
            //출력한다.
        }
        bw.write("/n");
        bw.flush();

        // 참고 블로그 https://st-lab.tistory.com/196
    }//main
}//class
