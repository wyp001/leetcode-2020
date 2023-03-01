package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/
 */
public class Offer53 {
    public static void main(String[] args) {
        Offer53 obj = new Offer53();
        // int[] nums = {0, 1, 3};
        // int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        // int[] nums = {1};
        int[] nums = {0, 1};
        int res = obj.missingNumber(nums);
        System.out.println(res);
    }

    public int missingNumber(int[] nums) {
        if (nums.length == 1) {
           int tmp =  nums[0] -1;
           if (tmp < 0) {
               return nums[0] +1;
           }
           return tmp;
        }
        if (nums[0]>0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                return nums[i - 1] + 1;
            }
        }
        return nums[nums.length-1] +1;
    }

}
