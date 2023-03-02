package com.wyp.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/merge-sorted-array/
 */
public class T88 {
    public static void main(String[] args) {
        T88 obj = new T88();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        obj.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        
        for (int e : nums1) {
            System.out.printf(e + "\t");
        }
    }
}
