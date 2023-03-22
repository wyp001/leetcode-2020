package com.wyp.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/mean-of-array-after-removing-some-elements/
 */
public class T1619 {
    public static void main(String[] args) {
        T1619 obj = new T1619();
        // int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        // int[] arr = {6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0};
        // int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        int[] arr = {9,7,8,7,7,8,4,4,6,8,8,7,6,8,8,9,2,6,0,0,1,10,8,6,3,3,5,1,10,9,0,7,10,0,10,4,1,10,6,9,3,6,0,0,2,7,0,6,7,2,9,7,7,3,0,1,6,1,10,3};
        double result = obj.trimMean(arr);
        System.out.println("result = " + result);
    }

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int n = length * 5 / 100;
        Integer sum = 0;
        for (int i = n; i < arr.length - n; i++) {
            sum += arr[i];
        }
        double result = sum.doubleValue() / (length - 2 * n);
        return result;
    }

}
