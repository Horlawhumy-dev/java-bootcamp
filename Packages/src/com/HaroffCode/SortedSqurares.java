package com.haroffcode;

import java.util.Arrays;

public class SortedSqurares {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sorting(squares(nums))));
    }

    static int[] squares(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        return nums;
    }

    static int[] sorting(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[j-1]){
                    swap(j, j-1, nums);
                }
            }

        }
        return nums;
    }

    static void swap(int first, int second, int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
