package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/rotate-string/
 */
public class T796 {
    public static void main(String[] args) {
        T796 obj = new T796();
        String str = "abcde";
        String goal = "cdeab";

        str = "abcde";
        goal = "abced";

        boolean res = obj.rotateString(str, goal);
        System.out.println("res = " + res);
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String suffix = s.substring(i);
            if (goal.startsWith(suffix)) {
                String pre = s.substring(0, i);
                if (goal.endsWith(pre)) {
                    return true;
                }
            }
        }
        return false;
    }
}
