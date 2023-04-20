package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/count-special-quadruplets/
 */
public class T1995 {
    public static void main(String[] args) {
        T1995 obj = new T1995();
        int[] nums = {1, 2, 3, 6};
        int res = obj.countQuadruplets(nums);
        System.out.println("res = " + res);
    }

    public int countQuadruplets(int[] nums) {
        int cnt = 0;
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                for (int c = b + 1; c < nums.length; c++) {
                    for (int d = c + 1; d < nums.length; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
