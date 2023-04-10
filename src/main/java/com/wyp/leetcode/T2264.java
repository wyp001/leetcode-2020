package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.cn/problems/largest-3-same-digit-number-in-string/
 */
public class T2264 {

    public static void main(String[] args) {
        T2264 obj = new T2264();
        String num = "6777133339";
        num = "2300019";
        num = "42352338";
        String res = obj.largestGoodInteger(num);
        System.out.println("res = " + res);

    }

    public String largestGoodInteger(String num) {
        List<Integer> list = new ArrayList<>();
        char[] chars = num.toCharArray();
        for (int i = 2; i < chars.length; i++) {
            if (Objects.equals(chars[i], chars[i-1]) && Objects.equals(chars[i], chars[i-2])) {
               String numStr = new StringBuilder()
                       .append(chars[i])
                       .append(chars[i - 1])
                       .append(chars[i - 2])
                       .toString();
                list.add(Integer.parseInt(numStr));
            }
        }
        if (list.size() > 0) {
            Integer resInt = list.stream().max(Comparator.comparingInt(e -> e)).get();
            if (resInt == 0) {
                return "000";
            }
            return resInt.toString();
        }
        return "";
    }
}
