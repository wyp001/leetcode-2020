package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/reverse-prefix-of-word/
 */
public class T2000 {
    public static void main(String[] args) {
        T2000 obj = new T2000();
        String word = "abcdefd";
        char ch = 'd';
        String res = obj.reversePrefix(word, ch);
        System.out.println("res = " + res);
    }

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch) + 1;
        return new StringBuilder(word.substring(0, index)).reverse().append(word.substring(index)).toString();
    }
}
