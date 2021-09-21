package com.HaroffCode;

public class CeilingSolutions {
    public static void main(String[] args) {
        // given array for testing
        int[] arr = {2, 4, 6, 7, 9, 10, 16, 18, 21};
        int ans = ceiling(arr, 12);
        // printing to the console
        System.out.println(ans);
    }
//    return smallest number >= target
    static int ceiling(int[] ar, int target){
        int start = 0;
        int end = ar.length - 1;

        // while start index is not greater than end index
        while(start <= end){
            int mid = start + (end - start) / 2;

            // if target is not found in ascending array
            if(target > ar[ar.length - 1] ) {
                return -1;
            }

            if(target < ar[mid]){
                end = mid -1;
            }else if(target > ar[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        // case when it remains only one element --> worst case
        return ar[end];

    }
}