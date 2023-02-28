package com.wyp.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class Offer03 {

    public static void main(String[] args) {
        Offer03 obj = new Offer03();
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int res = obj.findRepeatNumber01(nums);
        System.out.println(res);
    }


    public int findRepeatNumber01(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.getOrDefault(num, 0);
            if (count >=1 ) {
                return num;
            }
            map.put(num, count +1);
        }
        return -1;
    }
}
