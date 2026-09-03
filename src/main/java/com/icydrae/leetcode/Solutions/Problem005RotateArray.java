package com.icydrae.leetcode.Solutions;

public class Problem005RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int rotations = k % length;

        // 1. reverse whole array
        this.reverse(nums, 0, length - 1);

        // 2. reverse first k numbers
        this.reverse(nums, 0, rotations - 1);

        // 3. reverse last n-k numbers
        this.reverse(nums, rotations, length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;

            left++;
            right--;
        }
    }
}
