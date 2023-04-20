package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/count-square-sum-triples/
 */
public class T1925 {
    public static void main(String[] args) {
        T1925 obj = new T1925();
        int n = 5;
        int res = obj.countTriples(n);
        System.out.println("res = " + res);
    }

    public int countTriples(int n) {
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sum = a * a + b * b;
                if (sum > (n * n)) {
                    break;
                }
                for (int c = 1; c <= n; c++) {
                    if ((a * a + b * b) == (c * c)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
