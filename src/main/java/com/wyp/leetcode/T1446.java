package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1446 {
    public static void main(String[] args) {
        T1446 obj = new T1446();
        String str = "leetcode";    // 2
        str = "triplepillooooow";   // 5
        str = "hooraaaaaaaaaaay";   // 11
        str = "tourist";   // 1
        str = "j";   // 1
        str = "cc";   // 2
        str = "aa" +
                "bbbbb" +
                "cccc" +
                "ddddddd" +
                "e" +
                "ffffff" +
                "ggg" +
                "hhhhh" +
                "iiiii" +
                "jjj" +
                "kkkkk" +
                "llll" +
                "mmmmm" +
                "nnnnn" +
                "oo" +
                "pppq" +
                "rrrr" +
                "sss" +
                "tttt" +
                "uuuu" +
                "vvvv" +
                "wwwwwww" +
                "xxxxx" +
                "yyy" +
                "zzzzzzzz";   // 8

        int res = obj.maxPower(str);
        System.out.println(res);
    }

    public int maxPower(String s) {
        if(s.replace(s.substring(0,1), "").length() == 0){
            return s.length();
        }
        List<Integer> list = new ArrayList();
        String[] items = s.split("");
        int n = 1;
        for (int i = 1; i < items.length; i++) {
            if(items[i].equals(items[i-1])){
                 n ++;
            }else {
                list.add(n);
                n = 1;
            }
            if(i == items.length -1){
                list.add(n);
            }
        }
        System.out.println(list.toString());
        int max = Collections.max(list);
        return max;
    }
}
