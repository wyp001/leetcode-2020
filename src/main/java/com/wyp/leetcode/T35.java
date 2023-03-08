package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/search-insert-position/
 */
public class T35 {
    public static void main(String[] args) {
        T35 obj = new T35();
        int[] nums = {1,3,5,6};
        int target = 5;
        target = 2;
        target = 7;

        int result = obj.searchInsert(nums, target);
        System.out.println("result = " + result);
    }

    public int searchInsert(int[] nums, int target) {
        if (target == nums[nums.length -1]) {
            return nums.length -1;
        }
        if (target > nums[nums.length -1]) {
            return nums.length;
        }
        if (target < nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length -1; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (target > nums[i] && target < nums[i+1]) {
                return i +1;
            }
        }
        return -1;
    }
}
