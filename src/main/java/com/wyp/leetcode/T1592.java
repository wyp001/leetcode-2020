package com.wyp.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.cn/problems/rearrange-spaces-between-words/
 */
public class T1592 {
    public static void main(String[] args) {
        T1592 obj = new T1592();
        String text = "  this   is  a sentence ";
        text = " practice   makes   perfect";
        text = "  walks  udp package   into  bar a";
        text = "a";
        text = "icxfdtla    bjagtwmsad    fqejf    ";
        String res = obj.reorderSpaces(text);
        System.out.println("res = " + res);
    }

    public String reorderSpaces(String text) {
        List<String> words = new ArrayList<>();
        int spaceCnt = 0;
        int wordLength = 0;
        for (String word : text.split(" ")) {
            if (!Objects.equals("", word)) {
                words.add(word);
                wordLength += word.length();
            }
        }
        spaceCnt = text.length() - wordLength;
        StringBuilder sb = new StringBuilder();
        if (words.size() ==1) {
            String word = words.get(0);
            sb.append(word);
            int length = text.length() - word.length();
            for (int i = 0; i < length; i++) {
                sb.append(" ");
            }
            return sb.toString();
        }
        int num = spaceCnt / (words.size()-1);
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb1.append("@");
        }
        String space = sb1.toString();

        sb.append(words.get(0));
        for (int i = 1; i < words.size(); i++) {
            sb.append(space);
            sb.append(words.get(i));
        }
        int restNum = spaceCnt -  (num * (words.size()-1));
        for (int i = 0; i < restNum; i++) {
            sb.append("@");
        }
        return sb.toString();
    }



}
