// import java.util.Arrays;
import java.util.HashMap;

// https://www.geeksforgeeks.org/majority-element/

/*
Given an array arr. Find the majority element in the array. If no majority exists, return -1. A majority element in an array is an element that appears strictly more than arr.size() / 2 times in the array.

Examples : 

Input : arr[] = {1, 1, 2, 1, 3, 5, 1}
Output : 1
Explanation: Note that 1 appear 4 times which is more than  7 / 2 times
*/

// Naive Approach
// TC O(n^2)
// SC O(1)
/*
public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            
            if(count > n/2) {
                return arr[i];
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(majorityElement(arr));
    }
}
*/

// Better Approach
// TC O(nlogn)
// Sc O(1)
/*
public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];

        int count = 1;
        Arrays.sort(arr);

        for(int i = 1; i < n; i++) {
            if(arr[i-1] == arr[i]) {
                count++;
            } else {
                if(count > n/2) {
                    return arr[i-1];
                }
                count = 1;
            }
        }

        if(count > n/2) {
            return arr[n-1];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));
    }
}
*/

// Optimal Approach
// TC O(n)
// SC O(n)
/*
public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
            if(countMap.get(num) > n/2) {
                return num;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(majorityElement(arr));
    }
}
*/

// Moore's Voting Algo
// TC O(nlogn)
// SC O(1)
@SuppressWarnings("unused")
public class MajorityElement {
    public static int majorityElement(int[] arr) {
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(majorityElement(arr));
    }
}