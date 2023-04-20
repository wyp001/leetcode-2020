package com.wyp.leetcode;

import java.util.*;

/**
 *  https://leetcode.cn/problems/find-the-difference/
 */
public class T389 {

    public static void main(String[] args) {
        T389 obj = new T389();
        String s = "abcd";
        String t = "abcde";
        char res = obj.findTheDifference(s, t);
        System.out.println("res = " + res);
    }

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char e : t.toCharArray()) {
            Integer cnt = map.getOrDefault(e, 0);
            map.put(e, cnt + 1);
        }
        for (char e : s.toCharArray()) {
            Integer cnt = map.getOrDefault(e, 0);
            if (cnt > 0) {
                map.put(e, cnt -1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer cnt = entry.getValue();
            if (cnt > 0) {
                return entry.getKey();
            }
        }
        return t.charAt(0);
    }
}
