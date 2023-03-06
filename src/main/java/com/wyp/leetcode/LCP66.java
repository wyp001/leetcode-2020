package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.cn/problems/600YaG/
 */
public class LCP66 {
    public static void main(String[] args) {
        LCP66 obj = new LCP66();
        // String[] demand = {"acd", "bed", "accd"};
        String[] demand = {"abc", "ab", "ac", "b"};
        int result = obj.minNumBooths(demand);
        System.out.println("result = " + result);
    }

    public int minNumBooths(String[] demand) {
        Map<String, Integer> ttlMap = new HashMap<>();
        List<Map<String, Integer>> mapList = new ArrayList<>();
        // 统计出每天每种展台的需求量
        for (String dayItems : demand) {
            Map<String, Integer> map = new HashMap<>();
            for (String item : dayItems.split("")) {
                Integer cnt = map.getOrDefault(item, 0);
                map.put(item, cnt + 1);
            }
            mapList.add(map);
        }
        // 汇总每种展台的需求量，以每天中每种展台的最大需求量为准
        for (Map<String, Integer> dayMap : mapList) {
            for (Map.Entry<String, Integer> entry : dayMap.entrySet()) {
                Integer cnt = ttlMap.getOrDefault(entry.getKey(), 0);
                if (cnt < entry.getValue()) {
                    ttlMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        int count = 0;
        for (Integer value : ttlMap.values()) {
            count += value;
        }
        return count;
    }
}
