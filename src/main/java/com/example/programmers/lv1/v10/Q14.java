package com.example.programmers.lv1.v10;
import java.util.*;
public class Q14 {


    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            Arrays.sort(participant);
            Arrays.sort(completion);


            //①초기화식 →②조건식 →③수행문 →④증감식 →②조건식→··
            //초기화식은 딱 한번만 수행하며, 조건이 참인 동안 ②~④ 순서로 반복문을 계속 수행합니다.

            int i = 0;
            for(i = 0; i < completion.length; i++) {
                if(!participant[i].equals(completion[i])) break;
            }

            System.out.println(i);
            return participant[i];
        }
    }
}

/* 다른 풀이 1
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) { //keySet() 메서드는 key의 값만 출력 //값만 가져오고 싶은 경우 values() 메서드를 사용
            if (hm.get(key) != 0){ //get(key) 키로 값 찾는 메서드
                answer = key;
            }
        }
        return answer;
    }
}
* */

/* 다른 풀이 2
import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
*/

/* 댜른 풀이 3
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = participant[participant.length-1];

        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer=participant[i];
                break;
            }
        }
        return answer;
    }
}
* */

/* 다른 풀이 4
//참고 블로그 https://coding-grandpa.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98-%ED%95%B4%EC%8B%9C-Lv-1

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(String p: participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
           // getOrDefault : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.
           //찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환
        }

        for(String c: completion) {
            map.put(c, map.get(c) -1);
        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}

* */

/*
완주하지 못한 선수
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다.
 단 한 명의 선수를 제외하고는
 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
입출력 예
participant	                                            completion	                            return
["leo", "kiki", "eden"]	                            ["eden", "kiki"]	                        "leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	                "mislav"
입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는
 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만,
완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만,
완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
* */