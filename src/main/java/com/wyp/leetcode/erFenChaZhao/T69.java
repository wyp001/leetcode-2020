package com.wyp.leetcode.erFenChaZhao;

/**
 * https://leetcode.cn/problems/sqrtx/
 */
public class T69 {
    public static void main(String[] args) {
        T69 obj = new T69();
        int x = 2147395600;
        int res = obj.mySqrt(x);
        System.out.println("res = " + res);
    }

    public int mySqrt(int x) {
        if (x >= 0 && x <= 1) {
            return x;
        }
        int res = 0;
        for (int i = 1; i <= x / 2; i++) {
            if ((long) x >= ((long) i * i)) {
                res = i;
            } else {
                break;
            }
        }
        return res;
    }

}
