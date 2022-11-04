package com.example.programmers.lv0.v50;

public class Q59 {
    class Solution {
        public int solution(int a, int b) {
            int answer = b / gcd(a, b);

            while(answer != 1) {
                if(answer % 2 == 0) {
                    answer /= 2;
                } else if (answer % 5 == 0) {
                    answer /= 5;
                } else {
                    return 2;
                }
            }

            return 1;
        }

        private int gcd(int a, int b) {
            if(b == 0) return a;

            else {
                return gcd(b, a % b);
            }
        }
    }


}


/* 다른 풀이
class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int gcd = 0;
        for(int i=1;i<=a && i<=b;i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        for(int i=3;i<=b/gcd;i+=2) {
            if(b/gcd % i == 0 && i % 5 != 0) {
                answer = 2;
                break;
            }
        }

        return answer;
    }
}

* */
/*
유한소수 판별하기
문제 설명
소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
분수를 소수로 고칠 때 유한소수로 나타낼 수 있는
분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.

기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을,
무한소수라면 2를 return하도록 solution 함수를 완성해주세요.

제한사항
a, b는 정수
0 < a ≤ 1,000
0 < b ≤ 1,000
입출력 예
a	b	result
7	20	1
11	22	1
12	21	2
입출력 예 설명
입출력 예 #1

분수 7/20은 기약분수 입니다. 분모 20의 소인수가 2, 5
이기 때문에 유한소수입니다. 따라서 1을 return합니다.
입출력 예 #2

분수 11/22는 기약분수로 나타내면 1/2 입니다. 분모 2는
소인수가 2 뿐이기 때문에 유한소수 입니다. 따라서 1을 return합니다.
입출력 예 #3

분수 12/21는 기약분수로 나타내면 4/7 입니다. 분모 7은
소인수가 7 이므로 무한소수입니다. 따라서 2를 return합니다.
Hint
분자와 분모의 최대공약수로 약분하면 기약분수를 만들 수 있습니다.
정수도 유한소수로 분류합니다.
* */