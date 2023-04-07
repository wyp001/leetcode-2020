package com.wyp.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.cn/problems/missing-number/
 */
public class T268 {

    public static void main(String[] args) {
        T268 obj = new T268();
        // int[] nums = {3, 0, 1};
        // int[] nums = {0,1};
        // int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums = {0};
        int result = obj.missingNumber(nums);
        System.out.println("result = " + result);
    }

    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int e : nums) {
            set.add(e);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

}
