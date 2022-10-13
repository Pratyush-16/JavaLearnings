package com.arrays;

public class ArrayPermutation {
    public static void main(String[] args) {

        int [] nums = {0,2,1,5,3,4};
        int []out= buildArray(nums);
        //Output: [0,1,2,4,5,3]
        System.out.println(out);
    }

    public static int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i ++)
             ans[i] = nums[nums[i]];
        return ans;
    }
}
