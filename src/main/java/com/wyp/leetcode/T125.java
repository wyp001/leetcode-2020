package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/**
 * https://leetcode.cn/problems/valid-palindrome/
 */
public class T125 {
    public static void main(String[] args) {
        T125 obj = new T125();
        String s = "A man, a plan, a canal: Panama";
        s = "race a car";
        s = " ";
        s = "0P";
        // s = "1a2";
        boolean res = obj.isPalindrome(s);
        System.out.println("res = " + res);
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        return Objects.equals(sb.toString(), sb.reverse().toString());
    }
}
