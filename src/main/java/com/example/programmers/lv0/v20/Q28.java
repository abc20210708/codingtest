package com.example.programmers.lv0.v20;

public class Q28 {
    class Solution {
        public int[] solution(int denum1, int num1, int denum2, int num2) {
            //참고 블로그
//https://velog.io/@kwb020312/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%B6%84%EC%88%98%EC%9D%98-%EB%8D%A7%EC%85%88

            // 분자
            int topNum = num1*denum2 + num2*denum1;
            // 분모
            int botNum = num1*num2;
            // 최소 공배수
            int maximum = 1;
            // 약분
            for(int i = 1 ; i <= topNum ; i ++) {
                if(topNum%i == 0 && botNum%i == 0) {
                    maximum = i;
                }
            }

            return new int[]{topNum/maximum, botNum/maximum};
        }
    }
}
/*
분수의 덧셈
문제 설명
첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1,
두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가
매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때
 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < denum1, num1, denum2, num2 < 1,000
입출력 예
denum1	num1	denum2	num2	result
1	    2	    3	    4	    [5, 4]
9	    2	    1	    3	    [29, 6]
입출력 예 설명
입출력 예 #1

1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
입출력 예 #2

9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.
* */