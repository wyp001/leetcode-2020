package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/maximum-repeating-substring/
 */
public class T1668 {
    public static void main(String[] args) {
        T1668 obj = new T1668();
        String sequence = "ababc";
        String word = "ab";

        sequence = "ababc";
        word = "ba";

        sequence = "ababc";
        word = "ac";

        sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        word = "aaaba";

        int res = obj.maxRepeating(sequence, word);
        System.out.println("res = " + res);
    }


    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String tmpWord = word;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (sequence.contains(tmpWord)) {
                count ++;
                tmpWord += word;
            } else {
                break;
            }
        }
        return count;
    }
}
