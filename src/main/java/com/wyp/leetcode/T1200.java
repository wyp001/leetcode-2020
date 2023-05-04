package com.wyp.leetcode;

import java.util.*;

/**
 * https://leetcode.cn/problems/minimum-absolute-difference/
 */
public class T1200 {
    public static void main(String[] args) {
        T1200 obj = new T1200();
        // int[] arr = {4,2,1,3};
        // int[] arr = {1, 3, 6, 10, 15};
        // int[] arr = {3, 8, -10, 23, 19, -4, -14, 27};
        int[] arr = {40, 11, 26, 27, -20};
        List<List<Integer>> res = obj.minimumAbsDifference(arr);
        for (List<Integer> list : res) {
            for (Integer item : list) {
                System.out.printf(item + " ");
            }
            System.out.println();
        }
    }


    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        set.add(arr[0]);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            set.add(arr[i]);
            if (arr[i] - arr[i-1] < minDiff) {
                minDiff = arr[i] - arr[i-1];
            }
        }
        List<List<Integer>> resList = new ArrayList<>();
        for (int e : arr) {
            if (set.contains(e + minDiff)) {
                resList.add(Arrays.asList(e, e + minDiff));
            }
        }
        return resList;
    }
}
