package com.icydrae.leetcode.Solutions;

// https://leetcode.com/problems/product-of-array-except-self/description/
public class Problem004ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] output = new int[length];

        left[0] = 1;
        right[length - 1] = 1;

        for (int i = 1; i < length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            output[i] = left[i] * right[i];
        }

        return output;
    }
}
