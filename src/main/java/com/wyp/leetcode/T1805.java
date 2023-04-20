package com.wyp.leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * https://leetcode.cn/problems/number-of-different-integers-in-a-string/
 */
public class T1805 {
    public static void main(String[] args) {
        T1805 obj = new T1805();
        String word = "a123bc34d8ef34";
        word = "leet1234code234";
        word = "a1b01c001";
        int res = obj.numDifferentIntegers(word);
        System.out.println("res = " + res);
    }

    public int numDifferentIntegers(String word) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                sb.append(" ");
            }
        }
        Set<String> set = new HashSet<>();
        for (String item : sb.toString().split(" ")) {
            if (!Objects.equals("", item)) {
                if (item.startsWith("0")) {
                    String numStr = item.replaceFirst("^0*", "");
                    set.add(numStr);
                } else {
                    set.add(item);
                }
            }
        }
        return set.size();
    }
}
