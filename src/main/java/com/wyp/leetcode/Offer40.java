package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/
 */
public class Offer40 {
    public static void main(String[] args) {
        Offer40 obj = new Offer40();
        int[] nums = {3,2,1};
        int k = 2;
        int[] res = obj.getLeastNumbers(nums, k);
        for (int e : res) {
            System.out.printf(e + "\t");
        }

    }

    public int[] getLeastNumbers(int[] arr, int k) {
        return  Arrays.stream(arr).sorted().limit(k).boxed().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 执行用时：35 ms, 在所有 Java 提交中击败了7.75%的用户
     * 内存消耗：42.6 MB, 在所有 Java 提交中击败了32.35%的用户
     */
    // public int[] getLeastNumbers(int[] arr, int k) {
    //     return  Arrays.stream(arr).sorted().limit(k).boxed().mapToInt(Integer::intValue).toArray();
    // }


}
