package com.HaroffCode;

public class FloorSolutions {
    public static void main(String[] args) {
        int[] givenArray = {40, 35, 15, 7, 6, 3, 1, 0, -3};

        int ans = floor(givenArray, 8);
        System.out.println(ans);
    }


    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }
}
