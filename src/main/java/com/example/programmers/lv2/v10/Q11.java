package com.example.programmers.lv2.v10;
import java.util.*;
public class Q11 {
    class Solution {
        HashSet<Integer> set = new HashSet<>();

        public boolean isPrime(int num) {
            //1. 0과 1은 소수가 아니다
            if (num == 0 || num == 1)
                return false;
            //2. limit 숫자를 계산
            int limit = (int) Math.sqrt(num);
            //3. limit까지 배수 여부를 확인
            for (int i = 2; i <= limit; i++) {
                if (num % i == 0)
                    return false;
            }

            return true;
        }

        public void mix(String a, String b) {
            //1. 현재 조합을 set에 추가
            if (!a.equals(""))
                set.add(Integer.parseInt(a));

            //2. 남은 숫자 중 한 개를 더해 새로운 조합을 만든다.
            for (int i = 0; i < b.length(); i++) {
                mix(a + b.charAt(i), b.substring(0, i) + b.substring(i + 1));
            }
        }

        public int solution(String numbers) {

            //1. 모든 조합의 숫자를 만든다.
            mix("", numbers);

            //2. 소수의 개수만 센다.
            int cnt = 0;
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                int num = it.next();
                if (isPrime(num)) cnt++;
            }

            //3. 소수의 개수를 반환한다.
            return cnt;
        }
    }
}

/*다른 풀이

    class Solution{
        HashSet<Integer> set = new HashSet<>();//중복값 제거 위한 set
        char[] arr; //종이조각
        boolean[] visited; //사용여부

        public int solution(String numbers) {
            int answer = 0;
            arr = new char[numbers.length()];
            visited = new boolean[numbers.length()];

            for(int i= 0; i < numbers.length(); i++) {
                arr[i] = numbers.charAt(i);
            }

            mix("", 0); //재귀함수

            answer = set.size();
            return answer;

        }

        //재귀로 구현, 가능한 숫자 조합 찾고 소수면 set에 추가
        public void mix(String str, int idx) {
            int num;
            if(!str.equals("")){
                num = Integer.parseInt(str);
                if(isPrime(num)) set.add(num); //소수판별
            }
            if(idx === arr.length) return;

            for(int i = 0; i < arr.length; i++) {
                if(visited[i]) continue;
                visited[i] = true;
                mix(str + arr[i], idx + 1);
                visited[i] = false;
            }
        }

        //소수판별
        public boolean isPrime(int num) {
            if(num == 0 || num == 1) return false;
            for(int i= 2; i * i <= num; i++) {
                if(num % i == 0) return false;
            }

            return true;
        }

    }

}
  */

/*
소수 찾기
문제 설명
한자리 숫자가 적힌 종이 조각이 흩어져있습니다.
흩어진 종이 조각을 붙여 소수를 몇 개
만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열
numbers가 주어졌을 때, 종이 조각으로 만들 수 있는
소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
입출력 예
numbers	return
"17"	3
"011"	2
입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

11과 011은 같은 숫자로 취급합니다.
* */