package com.example.leetcode.easy;

public class Q1480 {
    class Solution {
        public int[] runningSum(int[] nums) {

            int[] result = new int[nums.length];
            result[0] = nums[0];
            int total = 0;

            for(int i = 0; i < nums.length; i++) {
                total = total + nums[i];
                result[i] = total;
            }

            return result;

        }//
    }//
}

/* 다른 풀이
public int[] runningSum(int[] nums) {
		// modify the input array, adding n[i] with n[i-1]
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

		// return the modified array
        return nums;
    }
* */

/*
1480. Running Sum of 1d Array

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
* */
