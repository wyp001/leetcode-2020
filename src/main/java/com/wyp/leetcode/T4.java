package com.wyp.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。
 *
 * （这里，平面上两点之间的距离是欧几里德距离。）
 *
 * 你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。
 *
 *
 * 示例 1：
 *
 * 输入：points = [[1,3],[-2,2]], K = 1
 * 输出：[[-2,2]]
 * 解释：
 * (1, 3) 和原点之间的距离为 sqrt(10)，
 * (-2, 2) 和原点之间的距离为 sqrt(8)，
 * 由于 sqrt(8) < sqrt(10)，(-2, 2) 离原点更近。
 * 我们只需要距离原点最近的 K = 1 个点，所以答案就是 [[-2,2]]。
 * 示例 2：
 *
 * 输入：points = [[3,3],[5,-1],[-2,4]], K = 2
 * 输出：[[3,3],[-2,4]]
 * （答案 [[-2,4],[3,3]] 也会被接受。）
 *  
 *
 * 提示：
 *
 * 1 <= K <= points.length <= 10000
 * -10000 < points[i][0] < 10000
 * -10000 < points[i][1] < 10000
 * 通过次数26,966提交次数44,264
 *
 * 链接：https://leetcode-cn.com/problems/k-closest-points-to-origin
 */
public class T4 {

    public static void main(String[] args) {
        //参数数据
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;
        // int[][] points = {{3,3}, {5,-1}, {-2,4}};
        // int k = 2;
        // int[][] points = {{0,1}, {1,0}};
        // int k = 2;

        //执行
        int[][] ints = kClosest(points, k);

        //验证
        for (int i = 0; i < ints.length; i++) {
            System.out.println("x: " + ints[i][0]+"\t y: "+ ints[i][1]);
        }
    }

    /**
     *  思路：
     *  求出points数组中的每个点到原点的距离平方，放入到map中，点数组为key，距离为value
     *  将所有距离放到数组中并排序取出前 k 个放入到list中
     *  遍历map中value，值在list中的点保存到返回的resList中
     *
     */
    public static int[][] kClosest(int[][] points, int k) {
        Map<int[], Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int [] point = points[i];
            int distance = point[0] * point[0] + point[1]* point[1];
            map.put(point, distance);
        }
        Collection<Integer> values = map.values();
        Object[] objs = values.toArray();
        List<Object> distanceList = Arrays.asList(objs).stream().sorted().limit(k).collect(Collectors.toList());
        List<int []> resList = new ArrayList<>();
        map.entrySet().forEach(entry -> {
            if (distanceList.contains(entry.getValue())){
                resList.add(entry.getKey());
            }
        });
        return resList.toArray(new int[resList.size()][2]);
    }
}
