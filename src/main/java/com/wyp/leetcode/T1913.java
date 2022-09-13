package com.wyp.leetcode;

import java.util.Arrays;

/**
 * 1913. 两个数对之间的最大乘积差
 * https://leetcode.cn/problems/maximum-product-difference-between-two-pairs/
 */
public class T1913 {

    public static void main(String[] args) {
        T1913 obj = new T1913();
        // int[] nums = {5, 6, 2, 7, 4};
        int[] nums = {4, 2, 5, 9, 7, 4, 8};
        int res = obj.maxProductDifference(nums);
        System.out.println("res = " + res);
    }

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = nums[len - 1] * nums[len - 2] - nums[0] * nums[1];
        return res;
    }
}
