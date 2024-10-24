// https://leetcode.com/problems/find-in-mountain-array/

class MountainSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = findInMountainArray(target, arr);
        System.out.println(ans);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);
        int left = searchAes(mountainArr, target, 0, peakIndex);
        if (left != -1) {
            return left;
        }
        int right = searchDes(mountainArr, target, peakIndex + 1, mountainArr.length - 1);
        return right;
    }

    public static int findPeakIndex(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int searchAes(int[] mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == mountainArr[mid]) {
                return mid;
            } else if (target > mountainArr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int searchDes(int[] mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == mountainArr[mid]) {
                return mid;
            } else if (target < mountainArr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}