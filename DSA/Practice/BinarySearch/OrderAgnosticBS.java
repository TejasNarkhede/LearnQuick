public class OrderAgnosticBS {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] aes = {1,2,3,4,5,6,7,8,9,10};
                //   0 1 2 3 4 5 6 7 8 9
        int[] des = {10,9,8,7,6,5,4,3,2,1};
        int target = 8;
        System.out.println(orderAgnosticBS(des, target));
    }

    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        boolean isAes = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            if(isAes) {
                if(target < arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }

        return -1;
    }
}
