package com.wyp.leetcode;

import java.util.*;

/**
 * https://leetcode.cn/problems/find-the-difference-of-two-arrays/
 */
public class T2125 {
    public static void main(String[] args) {
        T2125 obj = new T2125();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        // int[] nums1 = {1,2,3,3};
        // int[] nums2 = {1,1,2,2};

        List<List<Integer>> res = obj.findDifference(nums1, nums2);
        for (List<Integer> list : res) {
            for (Integer item : list) {
                System.out.printf(item + " ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, String> map = new HashMap<>();
        for (int e : nums1) {
            map.put(e, map.getOrDefault(e, "") + 1);
        }
        for (int e : nums2) {
            map.put(e, map.getOrDefault(e, "") + 2);
        }
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (!entry.getValue().contains("2")) {
                list1.add(entry.getKey());
            } else if (!entry.getValue().contains("1")) {
                list2.add(entry.getKey());
            }
        }
        resList.add(list1);
        resList.add(list2);
        return resList;
    }

    // public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    //     Set<Integer> set2 = new HashSet<>();
    //     for (int e : nums2) {
    //         set2.add(e);
    //     }
    //     List<List<Integer>> resList = new ArrayList<>();
    //     List<Integer> list1 = new ArrayList<>();
    //     Set<Integer> set1 = new HashSet<>();
    //     for (int e : nums1) {
    //         set1.add(e);
    //         if (!set2.contains(e)) {
    //             if (!list1.contains(e)) {
    //                 list1.add(e);
    //             }
    //         }
    //     }
    //     resList.add(list1);
    //
    //     List<Integer> list2 = new ArrayList<>();
    //     for (int e : nums2) {
    //         if (!set1.contains(e)) {
    //             if (!list2.contains(e)) {
    //                 list2.add(e);
    //             }
    //
    //         }
    //     }
    //     resList.add(list2);
    //     return resList;
    // }
}
