public class MInMaxNum {
    public static void main(String[] args) {
        int[] arr = {12,3,5,76,34,23,54,7};
        System.out.println(findMinNum(arr));
        System.out.println(findMaxNum(arr));
    }

    public static int findMinNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        // for(int i = 1; i < arr.length; i++) {
        //     if(arr[i] < min) {
        //         min = arr[i];
        //     }
        // }
        for(int element : arr) {
            if(element < min) {
                min = element;
            }
        }
        return min;
    }

    public static int findMaxNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        // for(int i = 1; i < arr.length; i++) {
        //     if(arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        for(int element : arr) {
            if(element > max) {
                max = element;
            }
        }
        return max;
    }
}
