package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 动态规划实现敏感词校验
 */
public class BadWordCheck {

    public static void main(String[] args) {
        String str = "--aa1a--bb1b--cc1c--dd1d--ee1e--";
        List<String> wordDict = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", str);
        boolean res = isContainsBadWord(str, wordDict);
        System.out.println(res);

        // str = "123456789";
        // String res = str.substring(8, 9);
        // System.out.println(res);


    }

    public static boolean isContainsBadWord(String str, Collection<String> wordDict) {
        int n = str.length();
        boolean[] memo = new boolean[n + 1];
        memo[0] = false;
        for (int i = 1; i <= n; i++) { // 当字符串长度为 i 时，看该字符串长度下是否包含 wordDict 中的词汇
            for (int j = 0; j < i; j++) { // 使用不同的分割位置将字符串分割成两部分，判断分割
                if (memo[j] || wordDict.contains(str.substring(j, i))) {
                    return true;
                } else {
                    memo[i] = false;
                }
            }
        }
        return false;
    }

    /**
     * 列举出 发布内容字符串 str 中 包含的敏感词
     *
     * @param str      发布内容字符串
     * @param wordDict 敏感词列表
     * @return
     */
    public static List<String> queryContainsBadWord(String str, Collection<String> wordDict) {
        int n = str.length();
        boolean[] memo = new boolean[n + 1];
        memo[0] = false;
        List<String> badWords = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (memo[j] || wordDict.contains(str.substring(j, i))) {
                    badWords.add(str.substring(j, i));
                } else {
                    memo[i] = false;
                }
            }
        }
        return badWords;
    }


}
