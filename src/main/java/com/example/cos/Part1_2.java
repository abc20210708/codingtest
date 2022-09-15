package com.example.cos;

public class Part1_2 {

    /*
    해밍 거리(Hamming distance)란 같은 길이를 가진 두 개의 문자열에서 같은 위치에 있지만 서로 다른 문자의 개수를 뜻합니다.
    예를 들어 두 2진수 문자열이 "10010"과 "110"이라면, 먼저 두 문자열의 자릿수를 맞추기 위해 "110"의
    앞에 0 두개를 채워 "00110"으로 만들어 줍니다. 두 2진수 문자열은 첫 번째와 세 번째 문자가 서로 다르므로 해밍 거리는 2입니다.
    * */


    public String func_a(String str, int len){
        String padZero = "";
        int padSize = len;
        for(int i = 0; i < padSize; i++)
            padZero += "0";
        return padZero + str;
    }

    public int solution(String binaryA, String binaryB) {
        int maxLength = Math.max(binaryA.length(), binaryB.length());
        if(maxLength > binaryA.length())
            binaryA = func_a(binaryA, maxLength);
        if(maxLength > binaryB.length())
            binaryB = func_a(binaryB, maxLength);

        int hammingDistance = 0;
        for(int i = 0; i < maxLength; i++)
            if(binaryA.charAt(i) == binaryB.charAt(i))
                hammingDistance += 1;
        return hammingDistance;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Part1_2 sol = new Part1_2();
        String binaryA = "10010";
        String binaryB = "110";
        int ret = sol.solution(binaryA, binaryB);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
