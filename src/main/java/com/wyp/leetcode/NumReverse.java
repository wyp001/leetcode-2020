package com.wyp.leetcode;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 */
public class NumReverse {

    /**
     *  执行用时：20 ms
     *  内存消耗：38.1 MB
     */
    public static int reverse1(int x) {
        boolean isMinus = false;
        if (x < 0){
            isMinus = true;
            x = -x;
        }
        String strNum = ""+ x;
        HashMap<Integer, String> map = new HashMap<>();
        String[] strs = strNum.split("");
        for (int i = 0; i < strs.length; i++) {
            map.put(i, strs[i]);
        }
        String resStr = "";
        for (int i = 1; i <= strs.length; i++) {
            resStr = resStr + map.get(strs.length - i);
        }
        try {
            if (!isMinus){
                return Integer.parseInt(resStr);
            }
            return -Integer.parseInt(resStr);
        } catch (NumberFormatException e){
            return 0;
        }
    }


    /**
     *  执行用时：1 ms
     */
    public static int reverse2(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }


    public static int reverse3(int x) {
        String xStr = Integer.toString(x);
        String str = xStr;
        int flag = 1;
        if (x < 0) {
            flag = -1;
            str = xStr.substring(1);
        }
        try {
            return Integer.parseInt((new StringBuilder(str)).reverse().toString()) * flag;
        }catch (Exception e){
            return 0;
        }
    }


    public static void main(String[] args) {
        int num = 159;
        int result = reverse3(num);
        System.out.println(result);
    }



}
