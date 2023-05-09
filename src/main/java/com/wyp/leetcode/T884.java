package com.wyp.leetcode;

import java.util.*;

/**
 * https://leetcode.cn/problems/uncommon-words-from-two-sentences/
 */
public class T884 {
    public static void main(String[] args) {
        T884 obj = new T884();
        String str1 = "this apple is sweet";
        String str2 = "this apple is sour";
        String[] res = obj.uncommonFromSentences(str1, str2);
        for (String e : res) {
            System.out.printf(e + " ");
        }
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map1 = new HashMap<>();
        for (String word : s1.split(" ")) {
            Integer cnt = map1.getOrDefault(word, 0);
            map1.put(word, cnt + 1);
        }
        for (String word : s2.split(" ")) {
            Integer cnt = map1.getOrDefault(word, 0);
            map1.put(word, cnt + 1);
        }

        List<String> resList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1) {
                resList.add(entry.getKey());
            }
        }
        return resList.toArray(new String[resList.size()]);
    }
}
