package com.practice.arrays;

public class MaximumSumSubArray {

    public static int findMaxSum(int[] arr, int k){
        int n = arr.length;
        if(n < k){
            System.out.print("Invalid input");
            return -1;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }
        int maxSum = windowSum;

        for (int i = k ; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;

    }

    public static void main(String[] args){

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + findMaxSum(arr, k));
    }
}
