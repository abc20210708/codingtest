package com.example.programmers.lv1;

/*
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

numbers	           result
[1,2,3,4,6,7,8,0]	14

입출력 예 #1
5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.


* */


public class Q01 {
    public int solution(int[] numbers) {
        int answer = 45; //1부터 9까지의 합;
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        answer -= sum;

        return answer;
    }
}
