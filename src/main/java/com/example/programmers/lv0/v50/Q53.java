package com.example.programmers.lv0.v50;
import java.math.*;

public class Q53 {
    class Solution {
        public String solution(String bin1, String bin2) {

            BigInteger A_binary = new BigInteger(bin1, 2);
            BigInteger B_binary = new BigInteger(bin2, 2);

            //합 연산식(add)로 더해서 변수에 저장.
            BigInteger sum = A_binary.add(B_binary);

            //풀이방식에 적어둔 대로 2진수로 변환
            String sum_binary = sum.toString(2);

            return sum_binary;
        }
    }
}

/* 다른 풀이
class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}
* */

/*
이진수 더하기
문제 설명
이진수를 의미하는 두 개의 문자열 bin1과 bin2가
매개변수로 주어질 때, 두 이진수의 합을
return하도록 solution 함수를 완성해주세요.

제한사항
return 값은 이진수를 의미하는 문자열입니다.
1 ≤ bin1, bin2의 길이 ≤ 10
bin1과 bin2는 0과 1로만 이루어져 있습니다.
bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
입출력 예
bin1	bin2	result
"10"	"11"	"101"
"1001"	"1111"	"11000"
입출력 예 설명
입출력 예 #1

10 + 11 = 101 이므로 "101" 을 return합니다.
입출력 예 #2

1001 + 1111 = 11000 이므로 "11000"을 return합니다.
* */