package com.wyp.leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * https://leetcode-cn.com/problems/sort-characters-by-frequency/
 */
public class T451 {
    public static void main(String[] args) {
        T451 obj = new T451();
        String s = "tree";
        String res = obj.frequencySort(s);
        System.out.println("res = " + res);
    }

    public String frequencySort(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (String item : s.split("")) {
            if (map.containsKey(item)){
                map.put(item, map.get(item) + 1);
            }else {
                map.put(item, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        map.keySet().stream().sorted(Comparator.comparing(key -> map.get(key)).reversed()).forEach(key-> {
            for (Integer integer = 0; integer < map.get(key); integer++) {
                sb.append(key);
            }
        });
        return sb.toString();
    }

}
