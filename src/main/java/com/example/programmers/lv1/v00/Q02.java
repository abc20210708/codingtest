package com.example.programmers.lv1.v00;

/*
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

 left	right	result
  13	 17	      43

  입출력 예 #1

다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
수	약수	약수의 개수
13	1, 13	2
14	1, 2, 7, 14	4
15	1, 3, 5, 15	4
16	1, 2, 4, 8, 16	5
17	1, 17	2
따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
* */

public class Q02 {

        public int solution(int left, int right) {
            int answer = 0;

            int[] temp = new int[right - left + 1];

            for(int i = 0; i < temp.length; i++) {
                temp[i] = left++;
            }

            for(int i = 0; i < temp.length; i++) {
                for(int j = 1; j <= temp[i]; j++) {
                    if(temp[i] % j == 0) answer++;
                }
                if(answer % 2 != 0) temp[i] *= -1;

                answer = 0;
            }

            int sum = 0;
            for(int i = 0; i < temp.length; i++) {
                sum += temp[i];
            }

            return sum;
        }
    }

/*
다른 풀이

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}
* */