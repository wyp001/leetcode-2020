package com.wyp.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.cn/problems/unique-number-of-occurrences/
 */
public class T1207 {
    public static void main(String[] args) {
        T1207 obj = new T1207();
        // int[] arr = {1, 2, 2, 1, 1, 3};
        // int[] arr = {1,2};
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean res = obj.uniqueOccurrences(arr);
        System.out.println("res = " + res);
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            Integer cnt = map.getOrDefault(e, 0);
            map.put(e, cnt + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}
