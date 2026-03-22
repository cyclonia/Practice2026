package com.practice.arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            // Expand the window
            currentSum += nums[right];

            // Shrink the window as much as possible while sum >= target
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                
                // Subtract the element at 'left' and move the pointer forward
                currentSum -= nums[left];
                left++;
            }
        }

        // If minLength was never updated, no such subarray exists
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum length subarray: " + result); 
        // Output: 2 (The subarray is [4, 3])
    }
}