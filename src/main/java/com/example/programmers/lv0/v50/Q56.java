package com.example.programmers.lv0.v50;
import java.util.*;
public class Q56 {
    class Solution {
        public int[] solution(int n) {

            HashSet<Integer> set = new HashSet<>();

            for(int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    set.add(i);
                    System.out.println("i: "+i);
                    n /= i;
                }
            }

            int len = set.size();
            int[] result = new int[len];
            int idx = 0;
            for(int s: set) {
                result[idx++] = s;
            }

            Arrays.sort(result);

            return result;
        }
    }
}

/* 다른 풀이
class Solution {
    public int[] solution(int n) {
       List<Integer> list = new ArrayList<>();
        int div = 2;
        while(n > 1){
            if(n%div==0){
                if(!list.contains(div))
                    list.add(div);
                n /= div;
                continue;
            }
            div++;
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        return answer;
    }
}
* */
/*
소인수분해
문제 설명
소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때
n의 소인수를 오름차순으로 담은 배열을
return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ n ≤ 10,000
입출력 예
n	result
12	[2, 3]
17	[17]
420	[2, 3, 5, 7]
입출력 예 설명
입출력 예 #1

12를 소인수분해하면 2 * 2 * 3 입니다.
따라서 [2, 3]을 return합니다.
입출력 예 #2

17은 소수입니다. 따라서 [17]을 return 해야 합니다.
입출력 예 #3

420을 소인수분해하면 2 * 2 * 3 * 5 * 7 입니다.
따라서 [2, 3, 5, 7]을 return합니다.
* */