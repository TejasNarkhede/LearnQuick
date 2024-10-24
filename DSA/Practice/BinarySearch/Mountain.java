// https://leetcode.com/problems/find-peak-element/description/
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

/**
 * Mountain
 */
public class Mountain {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int ansIndex = peakIndex(arr);
        System.out.println(arr[ansIndex]);
    }

    public static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
                // you are in descending side search left
            } else {
                start = mid + 1;
                // you are in ascending side search right
            }
        }
        return start; // end up in middle start == end return any
    }
}