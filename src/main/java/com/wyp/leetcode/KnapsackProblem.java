package com.wyp.leetcode;

/**
 * 动态规划解决背包问题
 * 01背包问题：即放入背包的物品不可重复
 * 完全背包问题：即放入背包的物品可以重复 （完全背包问题可以转化成01背包问题）
 */
public class KnapsackProblem {

    public static void main(String[] args) {
        //物品的重量
        int[] w = {1, 4, 3};
        //物品的价值 这里val[i] 就是前面讲的v[i]
        int[] val = {1500, 3000, 2000};
        //背包的容量
        int m = 4;
        //物品的个数
        int n = val.length;
        // 不同物品个数n、不同背包容量m下，背包可以装下物品的最大价值记录表
        int[][] memo = new int[n + 1][m + 1];
        // path 二维数组记录存放物品的情况
        int[][] path = new int[n + 1][m + 1];

        method01(w, val, m, n, memo, path);

        int[][] vw = new int[n][2];
        vw[0][0] = 1;
        vw[0][1] = 1500;
        vw[1][0] = 4;
        vw[1][1] = 3000;
        vw[2][0] = 3;
        vw[2][1] = 2000;
        System.out.println("=======vw二位数组============");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < vw[i].length; j++) {
                System.out.printf(vw[i][j] + " ");
            }
            System.out.println();
        }
        method02(m, n, vw);
    }

    private static void method01(int[] w, int[] val, int m, int n, int[][] memo, int[][] path) {
        for (int i = 0; i < n; i++) {
            memo[i][0] = 0;
        }
        for (int j = 0; j < m; j++) {
            memo[0][j] = 0;
        }
        for (int i = 1; i < memo.length; i++) { // 遍历行（物品重量）
            for (int j = 1; j < memo[i].length; j++) { // 遍历列（背包容量）j：背包容量
                if (w[i - 1] > j) {
                    // 第i个（索引为i-1的）物品重量 大于 背包容量时，则此时背包所能装下物品的最大价值 为 可选物品个数 n-1,背包容量为 j 时 的最大价值
                    memo[i][j] = memo[i - 1][j];
                } else {
                    // 第i个（索引为i-1的）物品重量 小于等于 背包容量时, 有两种方案
                    // 方案1：将第i个（索引为i-1的）物品 不放入背包，背包所能装下物品的最大价值 为 可选物品个数 n-1,背包容量为 j 时 的最大价值
                    int v1 = memo[i - 1][j];
                    // 方案2：将第i个（索引为i-1的）物品 放入背包，背包的剩余容量为 [j - w[i - 1]]，再找 可选物品个数 n-1,背包容量为 [j - w[i - 1]] 时 的最大价值；
                    //       2个价值的和 即为 该方案下 背包所能放下物品的最大价值
                    int v2 = val[i - 1] + memo[i - 1][j - w[i - 1]];
                    // 方案1 和 方案2 两种不同装法的最大值 即为 最终 背包所能放下物品的最大价值
                    if (v1 < v2) {
                        memo[i][j] = v2;
                        path[i][j] = 1;
                    } else {
                        memo[i][j] = v1;
                    }
                }
            }
        }
        System.out.println("--------物品个数为n，背包容量为m是，背包所能装下物品的最大价值--------------" + memo[n][m]);

        // ---------输出不同物品个数、不同背包容量下的最优解---------------
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                System.out.printf(memo[i][j] + " ");
            }
            System.out.println();
        }

        // for (int i = 0; i < path.length; i++) {
        //     for (int j = 0; j < path[i].length; j++) {
        //         if (path[i][j] == 1) {
        //             System.out.printf("第%d个商品放入到背包\n", i);
        //         }
        //     }
        // }

        System.out.println("================");

        //行的最大下标
        int i = path.length - 1;
        //列的最大下标
        int j = path[0].length - 1;
        //从path的最后开始找
        while (i > 0 && j > 0) {
            if (path[i][j] == 1) {
                System.out.printf("第%d个商品放入到背包\n", i);
                j -= w[i - 1];
            }
            i--;
        }
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算01背包问题的结果
     *
     * @param V  int整型 背包的体积
     * @param n  int整型 物品的个数
     * @param vw int整型二维数组 第一维度为n,第二维度为2的二维数组,vw[i][0],vw[i][1]分别描述i+1个物品的重量wi, 物品的价值vi
     * @return int整型
     */
    public static int method02(int V, int n, int[][] vw) {
        // dp[n]标识背包体积为n时，能装的最大重量
        int[] dp = new int[V + 1];
        //物品
        for (int i = 1; i <= n; i++) {
            //背包容量。倒序遍历
            for (int j = V; j > 0; j--) {
                //放得下
                if (j >= vw[i - 1][0]) {
                    dp[j] = Math.max(dp[j], dp[j - vw[i - 1][0]] + vw[i - 1][1]);
                }
                //放不下就是原来的值
            }
        }
        System.out.println("---------method02-------" + dp[V]);
        return dp[V];
    }
}
