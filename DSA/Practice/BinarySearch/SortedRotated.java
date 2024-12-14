public class SortedRotated {
    int search(int[] arr, int target) {
        // Complete this function
        int piv = pivot(arr);
        if(piv == -1){ return bs(arr, target, 0, arr.length-1);}
        if(arr[piv] == target){ return piv; }
        if(arr[0] <= target){ return bs(arr,target,0,piv-1); }
        return bs(arr,target,piv+1,arr.length-1);
    }
     int bs(int[]arr, int target, int s, int e){
        while (s<=e){
            int mid = s+(e-s)/2;
            if(target == arr[mid]) {return mid;}
            else if (target < arr[mid]) {e=mid-1;}
            else{s=mid+1;}
        }
        return -1;
    }
     int pivot(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) return mid;
            if (mid > s && arr[mid] < arr[mid - 1]) return mid-1;
            if (arr[mid] <= arr[s]) e = mid - 1;
            else s = mid + 1;
        }
        return -1;
    }
}