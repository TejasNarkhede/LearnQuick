// Floor of a number
// Return Index of Target or Greatest number that is smaller then or equal to target

public class FloorOfNum {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 11, 12 };
        int target = 1;
        int ans = ceiling(nums, target);
        System.out.println(ans);
    }

    public static int ceiling(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
