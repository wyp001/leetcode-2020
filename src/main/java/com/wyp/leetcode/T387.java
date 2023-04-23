package com.wyp.leetcode;


/**
 * https://leetcode.cn/problems/first-unique-character-in-a-string/
 */
public class T387 {
    public static void main(String[] args) {
        T387 obj = new T387();
        String str = "leetcode";
        // str = "loveleetcode";
        // str = "aabb";
        int res = obj.firstUniqChar(str);
        System.out.println("res = " + res);
    }

    public int firstUniqChar(String s) {
        char[] items = s.toCharArray();
        for (int i = 0; i < items.length; i++) {
            int lastIndex = s.lastIndexOf(items[i]);
            if (lastIndex == -1) {
                return -1;
            } else {
                if (s.indexOf(items[i]) == lastIndex) {
                    return i;
                }
            }
        }
        return -1;
    }
}
