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
        String lastStr = num.substring(num.length() - 1);
        if (Integer.parseInt(lastStr) % 2 == 1) {
            return num;
        }
        Integer maxIndex = null;
        String[] nStrs = num.split("");
        for (int i = 0; i < num.split("").length; i++) {
            long n = Integer.parseInt(nStrs[i]);
            if (n % 2 == 1) {
                maxIndex = i;
            }
        }
        if (Objects.isNull(maxIndex)) {
            return "";
        }
        return num.substring(0, maxIndex + 1);
    }


}
