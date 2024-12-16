// https://leetcode.com/problems/running-sum-of-1d-array/description/
// 1480. Running Sum of 1d Array

import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(nums)));
    }


    // Brute
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];
        for (int i = 0; i < n; i++) {
            runningSum[i] = sum(nums, 0, i);
        }
        return runningSum;
    }

    public static int sum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
