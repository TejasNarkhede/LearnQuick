package DSA.Practice.KadaneAlgo;

// Kadane's Algorithm is a dynamic programming technique used to find the maximum subarray sum within a given array of numbers.

public class MaxSubArrSum {
    int maxSubarraySum(int[] arr) {

        int sum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}