package com.wyp.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.cn/problems/WqXACV/
 */
public class LCS02 {
    public static void main(String[] args) {
        LCS02 obj = new LCS02();
        // int[] questions = {2, 1, 6, 2};
        // int[] questions = {1, 5, 1, 3, 4, 5, 2, 5, 3, 3, 8, 6};
        int[] questions = {1000, 1000};
        int result = obj.halfQuestions(questions);
        System.out.println(result);
    }

    public int halfQuestions(int[] questions) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : questions) {
            Integer cnt = map.getOrDefault(e, 0);
            map.put(e, cnt + 1);
        }
        int n = questions.length / 2;
        List<Integer> cntList = new ArrayList<>(map.values());
        Collections.sort(cntList);
        int result = 0;
        int sum = 0;
        for (int i = cntList.size()-1; i >= 0 ; i--) {
            Integer cnt = cntList.get(i);
            sum = sum + cnt;
            result +=1;
            // 倒序计算map中抽取次数最高的和，每计算一个，result +1，指导和大于等于n
            if ( sum >= n) {
                break;
            }
        }
        return result;
    }

}
