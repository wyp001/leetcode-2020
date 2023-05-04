package com.wyp.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/maximum-number-of-balloons/
 */
public class T1189 {
    public static void main(String[] args) {
        T1189 obj = new T1189();
        String text = "nlaebolko";
        // text = "loonbalxballpoon";
        text = "leetcode";
        int res = obj.maxNumberOfBalloons(text);
        System.out.println("res = " + res);
    }

    // balloon  b1 a1 l2 o2 n1
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : text.toCharArray()) {
            Integer cnt = map.getOrDefault(ch, 0);
            map.put(ch, cnt + 1);
        }
        Integer nCnt = map.getOrDefault('n', 0);
        Integer lCnt = map.getOrDefault('l', 0) / 2;
        Integer aCnt = map.getOrDefault('a', 0);
        Integer bCnt = map.getOrDefault('b', 0);
        Integer oCnt = map.getOrDefault('o', 0) / 2;
        int min = Math.min(nCnt, lCnt);
        min = Math.min(aCnt, min);
        min = Math.min(bCnt, min);
        min = Math.min(oCnt, min);
        return min;
    }
}
