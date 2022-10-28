package com.example.programmers.lv0.v50;
import java.math.*;
public class Q54 {
    class Solution {
        public BigInteger solution(int balls, int share) {
            BigInteger n = BigInteger.ONE, m = BigInteger.ONE;
            long select1 = balls-share > share ? balls-share : share;
            long select2 = balls-share > share? share : balls-share;
            for(long i = select1+1; i <= balls; i++)
                n = n.multiply(BigInteger.valueOf(i));
            for(long i = 2L; i <= select2; i++)
                m = m.multiply(BigInteger.valueOf(i));
            return n.divide(m);
        }
    }
}

/* 다른 풀이
import java.math.*;
class Solution {
    public BigDecimal solution(int balls, int share) {
        BigDecimal answer = new BigDecimal(0);
        // Hint:서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다.
        // n! / (n-m)! * m!
        BigDecimal num1 = getFactorial(balls);
        BigDecimal num2 = getFactorial(share);
        BigDecimal num3 = getFactorial(balls - share);
        answer = num1.divide(num2.multiply(num3));
        return answer;
    }

    private BigDecimal getFactorial(int number) {
        BigDecimal sum = new BigDecimal(1);
        if (number < 2) {
            return sum;
        }
        BigDecimal multi;
        for (int idx = 2; idx <= number; idx++) {
            multi = new BigDecimal(idx);
            sum = sum.multiply(multi);
        }
        return sum;
    }
}
* */

/*
구슬을 나누는 경우의 수
문제 설명
머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
구슬은 모두 다르게 생겼습니다.
머쓱이가 갖고 있는 구슬의 개수 balls와
친구들에게 나누어 줄 구슬 개수 share이
매개변수로 주어질 때, balls개의 구슬 중
share개의 구슬을 고르는 가능한 모든 경우의 수를
return 하는 solution 함수를 완성해주세요.

제한사항
1 ≤ balls ≤ 30
1 ≤ share ≤ 30
구슬을 고르는 순서는 고려하지 않습니다.
share ≤ balls
입출력 예
balls	share	result
3	    2	    3
5	    3	    10
입출력 예 설명
입출력 예 #1

서로 다른 구슬 3개 중 2개를 고르는 경우의 수는 3입니다.
입출력 예 #2

서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 10입니다.


* */