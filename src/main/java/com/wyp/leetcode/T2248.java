package com.wyp.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.cn/problems/intersection-of-multiple-arrays/
 */
public class T2248 {
    public static void main(String[] args) {
        T2248 obj = new T2248();
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        List<Integer> res = obj.intersection(nums);
        System.out.println("res = " + res);
    }


    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : nums) {
            for (int e : arr) {
                Integer cnt = map.getOrDefault(e, 0);
                map.put(e, cnt + 1);
            }
        }
        List<Integer> resList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == nums.length) {
                resList.add(entry.getKey());
            }
        }
        return resList.stream().sorted().collect(Collectors.toList());
    }


    /**
     * 执行用时：10 ms, 在所有 Java 提交中击败了5.97%的用户
     * 内存消耗：42.4 MB, 在所有 Java 提交中击败了8.07%的用户
     */
    // public List<Integer> intersection(int[][] nums) {
    //     int[] arr1 = nums[0];
    //     List<Set<Integer>> list = new ArrayList<>();
    //     for (int i = 1; i < nums.length; i++) {
    //         Set<Integer> set = Arrays.stream(nums[i]).boxed().collect(Collectors.toSet());
    //         list.add(set);
    //     }
    //     List<Integer> resList = new ArrayList<>();
    //     for (int item : arr1) {
    //         boolean flag = true;
    //         for (Set<Integer> set : list) {
    //             if (!set.contains(item)) {
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if (flag) {
    //             resList.add(item);
    //         }
    //     }
    //     return resList.stream().sorted().collect(Collectors.toList());
    // }
}
