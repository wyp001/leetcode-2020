package com.wyp.leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     *  执行用时：134 ms
     *  内存消耗：38.5 MB
     */
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 用target - num中的其中一项 A，得到的值在map中查考是否有对用的key，
     * 如果有则返回最终结果；如果没有，则将A的值作为key,A在数组中的索引作为value存入map中
     *
     *  执行用时：3 ms
     *  内存消耗：38.3 MB
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int partnerNum = target - nums[i];
            if(map.containsKey(partnerNum)){
                return new int[]{map.get(partnerNum), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 14;

        int[] result = twoSum2(nums, target);

        //验证
        if (null != result) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + "\t");
            }
        } else {
            System.out.println("result为null");
        }

    }



}
