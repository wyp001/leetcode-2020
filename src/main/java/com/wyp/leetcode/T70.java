package com.wyp.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.cn/problems/climbing-stairs/
 */
public class T70 {
    public static void main(String[] args) {
        T70 obj = new T70();
        int n = 2; // result=2
        // n = 3;  // result=3
        // n = 4;  // result=5
        // n = 5;  // result=8
        int result = obj.climbStairs(n);
        System.out.println("result = " + result);
    }

    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 0);
        memo.put(1, 1);
        memo.put(2,2);
        memo.put(3, 3);
        if (n<=3) {
            return memo.get(n);
        }
        return m1(n, memo);
    }

    /**
     *  f(1) = 1
     *  f(2) = 2
     *  f(3) = 3
     *  f(n) = f(n-1) + f(n-2)
     *  把递归的中间结果缓存在map中，减少递归的次数
     */
    public int m1(int n, Map<Integer, Integer> map) {
        if (Objects.isNull(map.get(n-1))) {
            m1(n-1, map);
        }
        int result = map.get(n-1)  + map.get(n-2);
        map.put(n, result);
        return result;
    }


}
