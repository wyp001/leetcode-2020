package com.wyp.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/n-th-tribonacci-number/
 */
public class T1137 {
    private int count = 0;
    public static void main(String[] args) {
        T1137 obj = new T1137();
        int n = 4;
        n=25;
        int result = obj.tribonacci(n);
        System.out.println("result = " + result);
    }

    public int tribonacci(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,1);
        map.put(3,2);
        int result = tribonacci02(n, map);
        System.out.println("count = " + count);
        return result;
    }


    public int tribonacci02(int n, Map<Integer, Integer> map) {
        count ++;
        if (n <=2) {
            return map.get(n);
        }
        Integer res = map.get(n);
        if (res != null) {
            return res;
        }
        res =  tribonacci02(n-3, map) + tribonacci02(n-2, map) + tribonacci02(n-1, map);
        map.put(n, res);
        return res;
    }
}
