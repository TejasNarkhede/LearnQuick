// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

public class NumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        System.out.println(countFreq(arr, target));
    }

    static int firstOcc(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int first = -1;
        while(s<=e) {
            int mid = s + (e-s) / 2;
            if(arr[mid] == target) {
                first = mid;
                e = mid-1;
            } else if (arr[mid] > target) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return first;
    }
    
    static int secondOcc(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int second = -1;
        while(s<=e) {
            int mid = s + (e-s) / 2;
            if(arr[mid] == target) {
                second = mid;
                s = mid+1;
            } else if (arr[mid] > target) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return second;
    }
    
    static int countFreq(int[] arr, int target) {
        // code here
        int first = firstOcc(arr, target);
        int second = secondOcc(arr, target);
        if (first == -1 || second == -1) {
            return 0; 
        }
        return second - first + 1;
    }
}
