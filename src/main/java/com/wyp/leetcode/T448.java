package com.wyp.leetcode;

import sun.security.pkcs11.wrapper.Functions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [4,3,2,7,8,2,3,1]
 * 输出：[5,6]
 * 示例 2：
 *
 * 输入：nums = [1,1]
 * 输出：[2]
 *  
 *
 * 提示：
 *
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 * 进阶：你能在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
 */
public class T448 {

    public static void main(String[] args) {
        T448 obj = new T448();
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> res = obj.findDisappearedNumbers(nums);

        for (Integer i : res) {
            System.out.print(i + "\t");
        }
    }

    /**
     * 执行用时：20 ms, 在所有 Java 提交中击败了15.41%的用户
     * 内存消耗：46.5 MB, 在所有 Java 提交中击败了96.57%的用户
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Object> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, null);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
