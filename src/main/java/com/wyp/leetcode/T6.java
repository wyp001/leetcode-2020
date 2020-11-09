package com.wyp.leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 *
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 *
 * 请返回你可以得到的最大数字。
 *
 * 示例 1：
 *
 * 输入：num = 9669
 * 输出：9969
 * 解释：
 * 改变第一位数字可以得到 6669 。
 * 改变第二位数字可以得到 9969 。
 * 改变第三位数字可以得到 9699 。
 * 改变第四位数字可以得到 9666 。
 * 其中最大的数字是 9969 。
 * 示例 2：
 *
 * 输入：num = 9996
 * 输出：9999
 * 解释：将最后一位从 6 变到 9，其结果 9999 是最大的数。
 * 示例 3：
 *
 * 输入：num = 9999
 * 输出：9999
 * 解释：无需改变就已经是最大的数字了。
 *
 *
 * 提示：
 *
 * 1 <= num <= 10^4
 * num 每一位上的数字都是 6 或者 9 。
 *
 * 链接：https://leetcode-cn.com/problems/maximum-69-number
 */
public class T6 {

    public static void main(String[] args) {
        int num = 9999;
        num = 9669;

        int result = maximum69Number(num);

        System.out.println(result);
    }

    /**
     * 思路：
     * 将数字转char型数组，将改动以个数字后的值放入list中
     * 获取list中最大的值
     */
    public static int maximum69Number (int num) {
        List<Integer> list = new ArrayList<>();
        list.add(num);
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Integer.parseInt(String.valueOf(chars[i]))== 6){
                char[] newChars = Arrays.copyOf(chars, chars.length);
                newChars[i] = "9".charAt(0);
                String numStr = String.valueOf(newChars);
                list.add(Integer.parseInt(numStr));
            }
            if(Integer.parseInt(String.valueOf(chars[i] ))== 9){
                char[] newChars = Arrays.copyOf(chars, chars.length);
                newChars[i] = "6".charAt(0);
                String numStr = String.valueOf(newChars);
                list.add(Integer.parseInt(numStr));
            }
        }
        // System.out.println(list);
        return list.stream().sorted().collect(Collectors.toList()).get(list.size()-1);
    }

    // public static int maximum69Number (int num) {
    //     List<Integer> list = new ArrayList<>();
    //     list.add(num);
    //     String s = String.valueOf(num);
    //     String[] strs = s.split("");
    //     for (int i = 0; i < strs.length; i++) {
    //         if(Integer.parseInt(strs[i] )== 6){
    //             String[] newStrs = Arrays.copyOf(strs, strs.length);
    //             newStrs[i] = "9";
    //             String numStr = StringUtils.join(Arrays.asList(newStrs), "");
    //             list.add(Integer.parseInt(numStr));
    //         }
    //         if(Integer.parseInt(strs[i] ) == 9){
    //             String[] newStrs = Arrays.copyOf(strs, strs.length);
    //             newStrs[i] = "6";
    //             String numStr = StringUtils.join(Arrays.asList(newStrs), "");
    //             list.add(Integer.parseInt(numStr));
    //         }
    //     }
    //     return list.stream().sorted().collect(Collectors.toList()).get(list.size()-1);
    // }



}
