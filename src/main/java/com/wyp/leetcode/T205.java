package com.wyp.leetcode;

import java.util.*;

/**
 * https://leetcode.cn/problems/isomorphic-strings/
 */
public class T205 {
    public static void main(String[] args) {
        T205 obj = new T205();
        String s = "egg";
        String t = "add";

        s = "foo";
        t = "bar";

        s = "paper";
        t = "title";

        s = "abaaa";
        t = "bcccc";

        boolean res = obj.isIsomorphic(s, t);
        System.out.println("res = " + res);
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, StringBuilder> map1 = new LinkedHashMap<>();
        char[] sCharArr = s.toCharArray();
        for (int i = 0; i < sCharArr.length; i++) {
            StringBuilder sb = map1.getOrDefault(sCharArr[i], new StringBuilder());
            map1.put(sCharArr[i], sb.append(i + ","));
        }
        StringBuilder sb1 = new StringBuilder();
        for (StringBuilder sbItem : map1.values()) {
            sb1.append(sbItem);
            sb1.append("-");
        }
        String s1 = sb1.toString();

        Map<Character, StringBuilder> map2 = new LinkedHashMap<>();
        char[] tCharArr = t.toCharArray();
        for (int i = 0; i < tCharArr.length; i++) {
            StringBuilder sb = map2.getOrDefault(tCharArr[i], new StringBuilder());
            map2.put(tCharArr[i], sb.append(i + ","));
        }
        StringBuilder sb2 = new StringBuilder();
        for (StringBuilder sbItem : map2.values()) {
            sb2.append(sbItem);
            sb2.append("-");
        }
        String s2 = sb2.toString();
        return Objects.equals(s1, s2);
    }


}
