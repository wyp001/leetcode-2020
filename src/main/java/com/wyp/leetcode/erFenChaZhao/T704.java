package com.wyp.leetcode.erFenChaZhao;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/binary-search/?plan=binary-search&plan_progress=zpop382
 */
public class T704 {

    public static void main(String[] args) {
        T704 obj = new T704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int res = obj.search(nums, target);
        System.out.println("res = " + res);
    }

    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
