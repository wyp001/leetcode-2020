package com.wyp.leetcode;

import java.awt.*;
import java.util.Arrays;

/**
 * https://leetcode.cn/problems/plus-one/
 */
public class T66 {
    public static void main(String[] args) {
        T66 obj = new T66();
        int[] digits = {1,2,3};
        // int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        // int[] digits = {9};
        int[] res = obj.plusOne(digits);
        for (int e : res) {
            System.out.printf(e + "");
        }

        // String str = "728509129536673284379577474947011174006";
        //                  728509129536673284379577474947011174007

    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len - 1] = digits[len - 1] + 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] >= 10) {
                digits[i] = digits[i] % 10;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }
        if (digits[0] >= 10) {
            int[] result = new int[len + 1];
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            result[1] = result[1] % 10;
            result[0] = 1;
            return result;
        }
        return digits;
    }

}
