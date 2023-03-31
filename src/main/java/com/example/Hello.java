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

    }
}
