package com.wyp.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/majority-element/
 */
public class T169 {

    public static void main(String[] args) {
        T169 obj = new T169();
        int[] nums = {3,2,3};

       int tmp = 4 / 2;
        System.out.println("tmp = " + tmp);

        int result = obj.majorityElement(nums);
        System.out.println("result = " + result);
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            Integer cnt = map.getOrDefault(e, 0);
            if (cnt >= (nums.length / 2)) {
                return e;
            }
            map.put(e, cnt + 1);
        }
        return -1;
    }

}
