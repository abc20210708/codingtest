package com.example;

public class Hello {
    public static void main(String[] args) { //main method
        int[] nums = {0, 1, 2, 3, 4};

        int[][] myNumbers = {{0},
                             {1, 2, 3, 4},
                            {5, 6, 7}, {8, 9}};

        System.out.println(nums.length);
        System.out.println("2차원 배열 총 길이: " + myNumbers.length);
        System.out.println("myNumbers[2]의 길이: " + myNumbers[2].length);
        System.out.println(myNumbers.length +" " + myNumbers[2].length);

    }
}

/* 객체는 소프트웨어 세계에서 구현할 대상이고, 이를 구현하기 위한 설계도가 클래스이며,
   이 설계도에 따라 소프트웨어 세계에 구현된 실체가 인스턴스 입니다.
** */