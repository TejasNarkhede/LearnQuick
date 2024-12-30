// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class Leetcode34 {
    public static void main(String[] args) {
        
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int first = bssearch(nums, target, true);
        int last = bssearch(nums, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    public int bssearch(int[] nums, int target, boolean findfirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findfirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
