package com.wyp.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.cn/problems/determine-if-string-halves-are-alike/
 */
public class T1704 {
    public static void main(String[] args) {
        T1704 obj = new T1704();
        String s = "book";
        // s = "textbook"; // text book
        s = "AbCdEfGh"; // AbCd EfGh
        boolean res = obj.halvesAreAlike(s);
        System.out.println("res = " + res);
    }

    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int length = s.length() / 2;
        int cnt1 = 0;
        for (char e : s.substring(0, length).toCharArray()) {
            if (set.contains(e)) {
                cnt1++;
            }
        }
        int cnt2 = 0;
        for (char e : s.substring(length).toCharArray()) {
            if (set.contains(e)) {
                cnt2++;
            }
        }
        return cnt1 == cnt2;
    }
}
