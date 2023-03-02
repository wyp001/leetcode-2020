package com.wyp.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.cn/problems/intersection-of-two-arrays/?envType=study-plan&id=zhijigangwei-mianshi&plan=zhijigangwei&plan_progress=f6ggc9r
 */
public class T349 {
    public static void main(String[] args) {
        T349 obj = new T349();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = obj.intersection(nums1, nums2);
        for (int e : result) {
            System.out.printf(e + "\t");
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Object> map = new HashMap<>();
        for (int e : nums1) {
            map.put(e, null);
        }
        for (int e : nums2) {
            if (map.containsKey(e)) {
                set.add(e);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
