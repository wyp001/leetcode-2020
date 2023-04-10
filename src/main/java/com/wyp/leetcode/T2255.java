package com.wyp.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.cn/problems/count-prefixes-of-a-given-string/
 */
public class T2255 {

    public static void main(String[] args) {
        T2255 obj = new T2255();
        // String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        // String str = "abc";

        String[] words = {"a","a"};
        String str = "aa";

        int result = obj.countPrefixes(words, str);
        System.out.println("result = " + result);
    }

    public int countPrefixes(String[] words, String s) {
        Set<String> set = new HashSet<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            String prefix = s.substring(0, i +1);
            set.add(prefix);
        }
        int count = 0;
        for (String word : words) {
            if (set.contains(word)) {
                count++;
            }
        }
        return count;
    }
}
