package com.example.chapter03.part04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//03-04 슬라이딩 윈도우 //12891
public class Unit009 { //009.DNA 비밀번호
    static int[] checkArr;
    static int[] myArr;
    static int checkSecret;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;
        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) checkSecret++;
        }
        for (int i = 0; i < P; i++) { //초기 P 부분 문자열 처리 부분
            Add(A[i]);
        }
        if (checkSecret == 4) Result ++;

        //슬라이딩 윈도우 처리 부분
        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) Result++;
        }
        System.out.println(Result);
        bf.close();
    }//main

    private static void Add(char c) { //새로 들어온 문자를 처리하는 함수
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }//switch
    }

    private static void Remove(char c) { //제거되는 문자를 처리하는 함수
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }//switch
    }
    //슈도코드
    /*
    //데이터 저장
    S(문자열 크기) P(부분 문자열의 크기)
    A(문자열 데이터)
    checkArr(비밀번호 체크 배열)
    // 변수 선언
    myArr(현재 상태 배열)
    checkSecret(몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수)
    P 범위(0 ~ P -1)만큼 S 배열에 적용하고, 유효한 비밀번호인지 판단하기
    for(i를 P에서 S까지 반복)
    {
        j선언 (i - P)
        //이 부분은 함수로 별도 구현하기
        한 칸씩 이동하면서 제거되는 문자열과 새로 들어오는 문자열을 처리하기
        유효한 비밀번호인지(checkSecret == 4) 판단해 결괏값에 업데이트하기
    }
    결괏값 출력하기

    별도 함수
    Add(문자 더하기 함수)
    {
        새로 들어온 문자를 myArr에 업데이트하거나 checkSecret 값 변경하기
    }
    Remove(문자 빼기 함수)
    {
        제거되는 문자를 myArr에 업데이트하거나 checkSecret 값 변경하기
    }
    * */

    /*
    참고 블로그 https://recordofwonseok.tistory.com/434

    (0, N-1)만큼 순회하며 가장 왼쪽 끝 문자를 카운트에서 지워줍니다.
    또한 새로 연결할 문자를(가장 왼쪽 인덱스 + P) 카운트에서 세어줍니다.
    * */

    /*
    참고 블로그 https://moonsbeen.tistory.com/257

     static int S,P;
     static int Result;
     static boolean[] visited;

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        S = sc.nextInt();
        P = sc.nextInt();

        visited = new boolean[10];
        for(int i = 0; i < m; i++) {
            visited[sc.nextInt()] = true;
        }

        backtracking(0,0);
        System.out.println(count);

     }//main

     public static void backtracking(int idx, int cnt) {

        if(idx == n) {
            if(cnt == m) count++;
            return;
        }

        for(int i = 0; i <= 9; i++) {
            if(visited[i]) {
                visited[i] = false;
                backtracking(idx + 1, cnt + 1);
                visited[i] = true;
            } else {
                backtracking(idx + 1, cnt);
            }
        }
     
     }//backtracking


     */




}//class
