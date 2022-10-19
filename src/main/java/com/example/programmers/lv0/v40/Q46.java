package com.example.programmers.lv0.v40;
import java.util.*;

public class Q46 {
    class Solution {
        public String solution(String letter) {
            String answer = "";

            HashMap<String, String> map = new HashMap<>();
            map.put(".-", "a"); map.put("-...", "b");
            map.put("-.-.", "c"); map.put("-..", "d");
            map.put(".", "e"); map.put("..-.", "f");
            map.put("--.", "g"); map.put("....", "h");
            map.put("..", "i"); map.put(".---", "j");
            map.put("-.-", "k"); map.put(".-..", "l");
            map.put("--", "m"); map.put("-.", "n");
            map.put("---", "o"); map.put(".--.", "p");
            map.put("--.-", "q"); map.put(".-.", "r");
            map.put("...", "s"); map.put("-", "t");
            map.put("..-", "u"); map.put("...-", "v");
            map.put(".--", "w"); map.put("-..-", "x");
            map.put("-.--", "y"); map.put("--..", "z");

            String[] splited = letter.split(" ");



            for(int i = 0; i < splited.length; i++) {
                for (Map.Entry<String ,String> entrySet : map.entrySet()) {
                    System.out.println(splited[i]);
                    if(splited[i].equals(entrySet.getKey())) {
                        answer += entrySet.getValue();
                    }
                }
            }

            return answer;
        }
    }
}

/* 다른 풀이
 String[] letters = letter.split(" ");
        for(String str : letters){
            answer += morse.get(str);
        }
* */

/*
모스부호 (1)
문제 설명
머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
문자열 letter가 매개변수로 주어질 때, letter를
영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
모스부호는 다음과 같습니다.

morse = {
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
제한사항
1 ≤ letter의 길이 ≤ 1,000
return값은 소문자입니다.
letter의 모스부호는 공백으로 나누어져 있습니다.
letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
해독할 수 없는 편지는 주어지지 않습니다.
편지의 시작과 끝에는 공백이 없습니다.
입출력 예
letter	                        result
".... . .-.. .-.. ---"	        "hello"
".--. -.-- - .... --- -."	    "python"
입출력 예 설명
입출력 예 #1

.... = h
. = e
.-.. = l
.-.. = l
--- = o
따라서 "hello"를 return 합니다.
입출력 예 #2

.--. = p
-.-- = y
- = t
.... = h
--- = o
-. = n
따라서 "python"을 return 합니다.
a ~ z에 해당하는 모스부호가 순서대로 담긴 배열입니다.
{".-","-...","-.-.","-..",".","..-.","--.",
"....","..",".---","-.-",".-..","--","-.",
"---",".--.","--.-",".-.","...","-","..-",
"...-",".--","-..-","-.--","--.."}
* */