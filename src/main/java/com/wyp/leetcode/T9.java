package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/palindrome-number/
 */
public class T9 {

    public static void main(String[] args) {
        T9 obj = new T9();
        int x = 121;
        x = 123;
        boolean res = obj.isPalindrome(x);
        System.out.println("res = " + res);
    }

    public boolean isPalindrome(int x) {
        // String s1 = String.valueOf(x);
        // if (s1.startsWith("-")) {
        //     return false;
        // }
        // char[] chars = s1.toCharArray();
        // StringBuilder sb = new StringBuilder();
        // for (int i = chars.length-1; i >= 0; i--) {
        //     sb.append(chars[i]);
        // }
        // String s2 = sb.toString();
        // return Objects.equals(s1, s2);

        String s1 = String.valueOf(x);
        if (s1.startsWith("-")) {
            return false;
        }
        return new StringBuilder(s1).reverse().toString().equals(s1);
    }
}
