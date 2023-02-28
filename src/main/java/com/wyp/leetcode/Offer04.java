package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class Offer04 {
    public static void main(String[] args) {
        Offer04 obj = new Offer04();
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        boolean res = obj.findNumberIn2DArray(matrix, target);
        System.out.println(res);

    }


    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int e : ints) {
                if (e == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // public boolean findNumberIn2DArray(int[][] matrix, int target) {
    //     Set<Integer> set = new HashSet<>();
    //     for (int[] ints : matrix) {
    //         for (int e : ints) {
    //             set.add(e);
    //         }
    //     }
    //     return set.contains(target);
    // }


}
