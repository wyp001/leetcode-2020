package com.wyp.leetcode;

/**
 * https://leetcode.cn/problems/largest-local-values-in-a-matrix/
 */
public class T2373 {

    public static void main(String[] args) {
        T2373 obj = new T2373();
        // int[][] grid = {
        //         {9, 9, 8, 1},
        //         {5, 6, 2, 6},
        //         {8, 2, 6, 4},
        //         {6, 2, 2, 2}
        // };
        // int[][] grid = {
        //         {1, 1, 1, 1, 1},
        //         {1, 1, 1, 1, 1},
        //         {1, 1, 2, 1, 1},
        //         {1, 1, 1, 1, 1},
        //         {1, 1, 1, 1, 1}};

        int[][] grid = {
                {1,  2,  3,  4,  5},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45}
        };



        int[][] res = obj.largestLocal(grid);
        for (int[] ints : res) {
            for (int e : ints) {
                System.out.printf(e + "\t");
            }
            System.out.println();
        }
    }


    /**
     * 思路：计算每个小的3x3矩阵的中间值的一周的最大值
     * @param grid
     * @return
     */
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length - 1; j++) {
                int max = grid[i][j];
                // 左上角
                max = Math.max(grid[i - 1][j - 1], max);
                // 正上
                max = Math.max(grid[i - 1][j], max);
                // 右上角
                max = Math.max(grid[i - 1][j + 1], max);
                // 正左
                max = Math.max(grid[i][j - 1], max);
                // 正右
                max = Math.max(grid[i][j + 1], max);
                // 左下角
                max = Math.max(grid[i + 1][j - 1], max);
                // 正下
                max = Math.max(grid[i + 1][j], max);
                // 右下角
                max = Math.max(grid[i + 1][j + 1], max);
                res[i - 1][j - 1] = max;
            }
        }
        return res;
    }

}
