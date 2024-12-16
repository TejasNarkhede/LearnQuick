// https://leetcode.com/problems/build-array-from-permutation/description/
// 1920. Build Array from Permutation

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(buildArray(nums)));

    }

    // Brute Force
     public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    
    //Optimized
}