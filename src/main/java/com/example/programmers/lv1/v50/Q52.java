package com.example.programmers.lv1.v50;

public class Q52 {
    public int solution(int n) {
        int answer = 0;

        int[] number = new int[n + 1];

        //2부터 n까지의 수를 배열에 넣는다.
        for(int i = 2; i <= n; i++)
            number[i] = i;

        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for(int i = 2; i <= n ; i++) {
            if(number[i] == 0) continue;

            for(int j = 2 * i; j <= n; j += i) {
                number[j] = 0;
            }
        }

        //배열에서 0이 아닌 것들의 개수를 세준다.
        for(int i = 0; i < number.length; i++) {
            if(number[i] != 0) answer++;
        }
        return answer;
    }

}

/* 다른 풀이
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(arr[i] == 1) continue;
            for(int j = i + i; j <= n; j += i) {
                System.out.println(j);
                arr[j] = 1;
            }
        }

        for(int i = 2; i < arr.length; i++)
            if(arr[i] != 1) answer++;

        return answer;
    }
}
* */

/*
소수 찾기
문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의
개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
* */