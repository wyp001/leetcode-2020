package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class Offer11 {
    public static void main(String[] args) {
        Offer11 obj = new Offer11();
        // int[] numbers = {3,4,5,1,2};
        int[] numbers = {2,2,2,0,1};
        int res = obj.minArray(numbers);
        System.out.println(res);
    }

    public int minArray(int[] numbers) {
        int min = numbers[0];
        for (int item : numbers) {
            if (item < min) {
                return item;
            }
        }
        return min;
    }
}
