package com.wyp.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 */
public class T1859 {
    public static void main(String[] args) {
        T1859 obj = new T1859();
        String str = "is2 sentence4 This1 a3";
        String res = obj.sortSentence(str);
        System.out.println("res = " + res);
    }

    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        int maxSort = 0;
        for (String item : s.split(" ")) {
            if (!Objects.equals("", item)) {
                String word = item.substring(0, item.length() - 1);
                int sort = Integer.parseInt(item.substring(item.length() - 1));
                map.put(sort, word);
                if (sort > maxSort) {
                    maxSort = sort;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= maxSort; i++) {
            sb.append(map.get(i));
            if (i != maxSort) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
