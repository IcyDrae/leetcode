package com.icydrae.leetcode.Solutions;

// https://leetcode.com/problems/maximum-subarray/description/
public class Problem001MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum = currentSum + nums[i];

            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }

        System.out.println(maxSoFar);
        return maxSoFar;
    }
}
