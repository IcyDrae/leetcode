package com.icydrae.leetcode.Solutions;

public class Problem006MaxConsecutiveOnes {
    // https://leetcode.com/problems/max-consecutive-ones/description/
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int oneCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                oneCount = 0;
            } else {
                oneCount = oneCount + 1;
            }

            if (oneCount > result) {
                result = oneCount;
            }
        }

        return result;
    }
}
