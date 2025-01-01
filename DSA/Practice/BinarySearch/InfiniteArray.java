public class InfiniteArray {
    public static void main(String[] args) {
        // assume infinite array
        int[] arr = { 1, 2, 3, 4, 5, 8, 9, 10, 11, 43, 67, 89, 112, 666, 887, 999, 2223, 4546, 7686, 7878 };
        int target = 112;
        System.out.println(ans(arr,target));
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
