package com.wyp.leetcode;

import java.util.*;

/**
 * @Description:
 * @author: wyupeng
 * @date: 2022/7/20 15:11
 */
public class T5 {

    public static void main(String[] args) {
        T5 obj = new T5();
        String str = "babad";
        // str = "a";
        str = "esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukivlpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuhdmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseorykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkvsvrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetufqvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsyafqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnrifvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqypyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreelnlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkkjayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyjziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekkmhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcmurdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiafjqaionbrjbjksxaezosxqmncejjptcksnoq";
        String res = obj.longestPalindrome(str);
        System.out.println(res);
    }


    /**
     * 超时
     * "esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukivlpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuhdmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseorykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkvsvrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetufqvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsyafqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnrifvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqypyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreelnlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkkjayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyjziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekkmhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcmurdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiafjqaionbrjbjksxaezosxqmncejjptcksnoq"
     */
    // public String longestPalindrome(String s) {
    //     int n = s.length();
    //     Map<String, Integer> resMap = new HashMap<>();
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 0; j < i; j++) {
    //             String s1 = s.substring(0, j);
    //             String reverseS1 = new StringBuilder(s1).reverse().toString();
    //             if (s1.startsWith(reverseS1)) {
    //                 resMap.put(s1, s1.length());
    //             }
    //             String s2 = s.substring(j, i);
    //             String reverseS2 = new StringBuilder(s2).reverse().toString();
    //             if (s2.startsWith(reverseS2)) {
    //                 resMap.put(s2, s2.length());
    //             }
    //         }
    //     }
    //     System.out.println(resMap);
    //     String resStr = "";
    //     for (String s1 : resMap.keySet()) {
    //         if (s1.length() > resStr.length()) {
    //             resStr = s1;
    //         }
    //     }
    //     return resStr;
    // }


    //优化01 超时
    public String longestPalindrome(String s) {
        int n = s.length();
        String resStr = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String s1 = s.substring(0, j);
                String reverseS1 = new StringBuilder(s1).reverse().toString();
                if (s1.startsWith(reverseS1)) {
                    if (s1.length() > resStr.length()) {
                        resStr = s1;
                    }
                }
                String s2 = s.substring(j, i);
                String reverseS2 = new StringBuilder(s2).reverse().toString();
                if (s2.startsWith(reverseS2)) {
                    if (s2.length() > resStr.length()) {
                        resStr = s2;
                    }
                }
            }
        }
        return resStr;
    }


}
