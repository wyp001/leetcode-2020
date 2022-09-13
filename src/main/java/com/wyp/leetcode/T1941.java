package com.wyp.leetcode;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> map = new HashMap<>();
        for (String str : s.split("")) {
            Integer num = map.getOrDefault(str, 0);
            map.put(str, num + 1);
        }
        long count = map.values().stream().distinct().count();
        if (count > 1) {
            return false;
        }
        return true;
    }
}
