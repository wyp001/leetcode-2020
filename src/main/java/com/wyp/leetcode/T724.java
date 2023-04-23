package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/find-pivot-index/
 */
public class T724 {
    public static void main(String[] args) {
        T724 obj = new T724();
        // int[] nums = {1, 7, 3, 6, 5, 6};
        // int[] nums = {1, 2, 3};
        int[] nums = {2, 1, -1};
        int res = obj.pivotIndex(nums);
        System.out.println("res = " + res);
    }

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                leftSum += nums[i-1];
            }
            if (2 * leftSum + nums[i] == sum) {
                return i;
            }
        }
        return -1;
    }
}
