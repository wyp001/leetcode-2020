package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/three-consecutive-odds/
 */
public class T1550 {
    public static void main(String[] args) {
        T1550 obj = new T1550();
        // int[] arr = {2,6,4,1};
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        boolean res = obj.threeConsecutiveOdds(arr);
        System.out.println("res = " + res);
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] % 2 == 1 && arr[i - 1] % 2 == 1 && arr[i - 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }


}
