package com.wyp.leetcode;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * https://leetcode.cn/problems/check-if-two-string-arrays-are-equivalent/
 */
public class T1662 {
    public static void main(String[] args) {
        T1662 obj = new T1662();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean result = obj.arrayStringsAreEqual(word1, word2);
        System.out.println("result = " + result);
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        return Objects.equals(str1, str2);
    }
}
