package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/find-the-highest-altitude/
 */
public class T1732 {
    public static void main(String[] args) {
        T1732 obj = new T1732();
        // int[] gain = {-5, 1, 5, 0, -7};
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        int result = obj.largestAltitude(gain);
        System.out.println("result = " + result);
    }

    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            arr[i + 1] = arr[i] + gain[i];
            if (arr[i + 1] > max) {
                max = arr[i + 1];
            }
        }
        return max;
    }
}
