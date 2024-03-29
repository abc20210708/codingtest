package com.example.programmers.lv2.v00;
import java.util.HashSet;
public class Q09 {

    class Solution {
        HashSet<Integer> set = new HashSet<>(); // 중복값 제거 위한 set
        char[] arr; // 종이조각
        boolean[] visited; // 사용여부

        public int solution(String numbers) {
            int answer = 0;
            arr = new char[numbers.length()];
            visited = new boolean[numbers.length()];

            for(int i=0; i<numbers.length(); i++){
                arr[i] = numbers.charAt(i);
            }

            recursion("",0); // 재귀함수

            answer = set.size();
            return answer;
        }

        // dfs 재귀로 구현. 가능한 숫자 조합 찾고 소수면 set에 추가
        public void recursion(String str, int idx){
            //System.out.println("재귀 str:"+str+", idx: "+idx);
            int num;
            if(str!=""){
                num = Integer.parseInt(str);
                if(isPrime(num)) set.add(num); // 소수판별
            }
            if(idx==arr.length) return; // 끝까지 다했을 때

            for(int i=0;i<arr.length;i++){
                if(visited[i]) continue; // 방문한 노드면 넘어감
                visited[i] = true; // 방문
                //System.out.println("for문 i:"+i+", str:"+str);
                recursion(str+arr[i], idx+1); // 방문 했을 시 재귀
                //System.out.println("for문2 i:"+i+", str:"+str);
                visited[i] = false; // 백트래킹
            }
        }//recursion

        // 소수 판별
        public boolean isPrime(int num){
            if(num==0||num==1) return false;
            for(int i=2; i*i<=num;i++){
                if(num%i==0) return false;
            }
            return true;
        }

    }
}
/*
//참고 블로그 https://hu-coding.tistory.com/132
* 소수 찾기
문제 설명
한자리 숫자가 적힌 종이 조각이 흩어져있습니다.
 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때,
종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

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

11과 011은 같은 숫자로 취급합니다.*/