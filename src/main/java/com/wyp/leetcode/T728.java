package com.wyp.leetcode;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.cn/problems/self-dividing-numbers/
 */
public class T728 {
    public static void main(String[] args) {
        T728 obj = new T728();
        int left = 1;
        int right = 22;

        left = 47;
        right = 85;

        List<Integer> res = obj.selfDividingNumbers(left, right);
        System.out.println("res = " + res);
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (String.valueOf(i).contains("0") || (i % (i % 10) != 0)) {
                continue;
            }
            boolean flag = true;
            for (String e : String.valueOf(i).split("")) {
                if (i % Integer.parseInt(e) != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
        return list;
    }
}
