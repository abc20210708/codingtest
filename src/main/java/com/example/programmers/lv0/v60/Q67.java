package com.example.programmers.lv0.v60;

public class Q67 {
    class Solution {
        public int solution(int n) {

            int num = 1, i = 1;

            while(i <= n) {
                if(!(num % 3 == 0 || String.valueOf(num).contains("3"))) i++;

                num++;
            }

            return num-1;
        }
    }
}

/* 다른 풀이
 class Solution {
    public int solution(int n) {
        String str;
        for (int i = 1; i <= n; i++){
            str = ""+i;
            if(str.contains("3") || i%3 == 0) n++;
        }
        return n;
    }
}

* */

/*
저주의 숫자 3
문제 설명
3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에
3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.

10진법	3x 마을에서 쓰는 숫자	10진법	3x 마을에서 쓰는 숫자
1	1	6	8
2	2	7	10
3	4	8	11
4	5	9	14
5	7	10	16
정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는
숫자로 바꿔 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
15	25
40	76
입출력 예 설명
입출력 예 #1

15를 3x 마을의 숫자로 변환하면 25입니다.
입출력 예 #2

40을 3x 마을의 숫자로 변환하면 76입니다.
* */