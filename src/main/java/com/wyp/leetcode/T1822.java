package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/sign-of-the-product-of-an-array/
 */
public class T1822 {
    public static void main(String[] args) {
        T1822 obj = new T1822();
        // int[] nums = {-1,-2,-3,-4,3,2,1};
        // int[] nums = {1,5,0,2,-3};
        int[] nums = {-1,1,-1,1,-1};
        int res = obj.arraySign(nums);
        System.out.println("res = " + res);
    }

    public int arraySign(int[] nums) {
        int cnt = 0;
        for (int item : nums) {
            if (item < 0) {
                cnt++;
            }
            if (item == 0) {
                return 0;
            }
        }
        if (cnt % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
