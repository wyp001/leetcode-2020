package com.wyp.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.cn/problems/merge-similar-items/
 */
public class T2363 {

    public static void main(String[] args) {
        T2363 obj = new T2363();
        // int[][] items1 = {{1,1}, {4,5}, {3,8}};
        // int[][] items2 = {{3,1}, {1,5}};

        // int[][] items1 = {{15,5},{2,6},{5,3},{14,8},{12,4},{19,6},{25,4},{13,4},{9,1}};
        // int[][] items2 = {{15,9},{2,4},{5,2},{14,4},{12,3},{19,10},{25,7},{13,6},{9,9}};

        int[][] items1 = {{1,1},{4,5},{3,8}};
        int[][] items2 = {{3,1},{1,5}};

        List<List<Integer>> res = obj.mergeSimilarItems(items1, items2);
        System.out.println(res);

    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> resList= new ArrayList<>();
        // key: 价值  value：重量之和
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] ints : items1) {
            Integer wightSum = map.getOrDefault(ints[0], 0);
            map.put(ints[0], wightSum + ints[1]);
        }
        for (int[] ints : items2) {
            Integer wightSum = map.getOrDefault(ints[0], 0);
            map.put(ints[0], wightSum + ints[1]);
        }
        List<Integer> keys = map.keySet().stream().sorted().collect(Collectors.toList());
        for (Integer key : keys) {
            resList.add(Arrays.asList(key, map.get(key)));
        }
        return resList;
    }

}
