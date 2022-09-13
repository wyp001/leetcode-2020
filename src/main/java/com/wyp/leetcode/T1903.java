package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 1903. 字符串中的最大奇数
 * https://leetcode.cn/problems/largest-odd-number-in-string/
 */
public class T1903 {

    public static void main(String[] args) {
        T1903 obj = new T1903();
        String num = "52";
        num = "4206";
        num = "35427";
        String res = obj.largestOddNumber(num);
        System.out.println("res = " + res);


    }


    public String largestOddNumber(String num) {
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.println("num.charAt(i) = " + num.charAt(i));
            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
