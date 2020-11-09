package com.wyp.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 * 输入: [3, 2, 1]
 * 输出: 1
 * 解释: 第三大的数是 1.
 *
 * 示例 2:
 * 输入: [1, 2]
 * 输出: 2
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 *
 * 示例 3:
 * 输入: [2, 2, 3, 1]
 * 输出: 1
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 *
 * 链接：https://leetcode-cn.com/problems/third-maximum-number

 */
public class T8 {
    public static void main(String[] args) {
        // int[] nums = {2, 2, 3, 1};
        // int[] nums = {2, 1};
        int[] nums = {1,2};
        // int[] nums = {3,2,1};
        // int[] nums = {1,1,2};
        // int[] nums = {1,2,2,5,3,5};

        int result = thirdMax(nums);
        System.out.println(result);

    }

    public static int thirdMax(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed() // 将元素转换成包装类
                .sorted(Comparator.reverseOrder()) //降序排序
                .distinct() // 去重
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list);
        if(list.size() < 3 ){
            return list.get(0);
        }else {
            return list.get(2);
        }
    }

}
