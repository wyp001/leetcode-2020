package com.wyp.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1941. 检查是否所有字符出现次数相同
 * https://leetcode.cn/problems/check-if-all-characters-have-equal-number-of-occurrences/
 */
public class T1941 {

    public static void main(String[] args) {
        T1941 obj = new T1941();
        String s = "abacbc";
        s = "aaabb";
        s = "vvvvvvvvvvvvvvvvvvv";
        boolean res = obj.areOccurrencesEqual(s);
        System.out.println("res = " + res);
    }

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Set<Integer> uniqueValues = new HashSet<>();
        for (Integer integer : map.values()) {
            uniqueValues.add(integer);
            if (uniqueValues.size() > 1) {
                return false;
            }
        }
        return true;
    }
}
