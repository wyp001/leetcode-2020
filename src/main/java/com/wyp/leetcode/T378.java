package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * 提示：
 *
 * num1 和num2 的长度都小于 5100
 * num1 和num2 都只包含数字 0-9
 * num1 和num2 都不包含任何前导零
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式
 *
 * 链接：https://leetcode-cn.com/problems/add-strings
 */
public class T378 {
    public static void main(String[] args) {
        // int[][] matrix = {
        //         { 1,  5,  9},
        //         {10, 11, 13},
        //         {12, 13, 15}};
        // int k = 8;
        int[][] matrix = {
                    { 1,2},
                    {1,3},
                };
        int k = 2;

        //验证
        int result = kthSmallest(matrix, k);
        System.out.println(result);
    }

    public static int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            List<Integer> ints = Arrays.stream(matrix[i]).boxed().collect(Collectors.toList());
            list.addAll(ints);
        }
        return list.stream().sorted().limit(k).collect(Collectors.toList()).get(k-1);
    }

}
