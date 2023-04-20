package com.wyp.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/sum-of-unique-elements/
 */
public class T1748 {
    public static void main(String[] args) {
        T1748 obj = new T1748();
        // int[] nums = {1,2,3,2};
        // int[] nums = {1,1,1,1,1};
        int[] nums = {1,2,3,4,5};
        int res = obj.sumOfUnique(nums);
        System.out.println("res = " + res);
    }

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : nums) {
            Integer cnt = map.getOrDefault(item, 0);
            map.put(item, cnt +1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer cnt = entry.getValue();
            if (cnt == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }

}
