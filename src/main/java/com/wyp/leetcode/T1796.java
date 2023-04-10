package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.cn/problems/second-largest-digit-in-a-string/
 */
public class T1796 {
    public static void main(String[] args) {
        T1796 obj = new T1796();
        String str = "dfa12321afd";
        str = "abc1111";
        int res = obj.secondHighest(str);
        System.out.println("res = " + res);
    }


    public int secondHighest(String s) {
        int max1 = -1;
        int max2 = -1;
        char[] chars = s.toCharArray();
        for (char e : chars) {
            if (Character.isLetter(e)) {
                continue;
            }
            int num = e - '0';
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        return max2;
    }


    // public int secondHighest(String s) {
    //     List<Integer> list = new ArrayList<>();
    //     for (String e : s.split("")) {
    //         if (e.matches("^\\d")) {
    //             int num = Integer.parseInt(e);
    //             if (!list.contains(num)) {
    //                 list.add(num);
    //             }
    //         }
    //     }
    //     if (list.size() >= 2) {
    //         return list.stream().sorted().collect(Collectors.toList()).get(list.size() -2);
    //     }
    //     return -1;
    // }
}
