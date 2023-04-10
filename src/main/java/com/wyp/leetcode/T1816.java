package com.wyp.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/truncate-sentence/
 */
public class T1816 {
    public static void main(String[] args) {
        T1816 obj = new T1816();
        String str = "Hello how are you Contestant";
        int k = 4;
        str = "What is the solution to this problem";
        k = 4;

        String res = obj.truncateSentence(str, k);
        System.out.println("res = " + res);
    }

    public String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        String[] resArr = Arrays.copyOf(split, k);
        return String.join(" ", resArr);
    }
}
