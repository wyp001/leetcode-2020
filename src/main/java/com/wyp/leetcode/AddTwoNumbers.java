package com.wyp.leetcode;

import java.util.*;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *  
 *
 * 提示：
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        // 初始化数据
        // ListNode node1 = obj.numToListNode(243);
        // ListNode node2 = obj.numToListNode(564);

        ListNode node1 = obj.numToListNode(249);
        ListNode node2 = obj.numToListNode(5649);

        // 方法调用
        ListNode listNode = obj.addTwoNumbers(node1, node2);

        // 验证输出
        List<Integer> resList = new ArrayList<>();
        obj.nodeToList(resList, listNode);
        for (Integer i : resList) {
            System.out.print(i + " ");
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        nodeToList(list1, l1);
        List<Integer> list2 = new ArrayList<>();
        nodeToList(list2, l2);
        int n1 = listToNumber(list1);
        int n2 = listToNumber(list2);
        int resNum = n1 + n2;
        ListNode node = numToListNode(resNum);
        return node;
    }

    private void nodeToList(List<Integer> resList,  ListNode node){
        resList.add(node.val);
        if (Objects.isNull(node.next)) {
            return;
        }
        nodeToList(resList, node.next);
    }



    private int listToNumber(List<Integer> resList){
        StringBuilder sb = new StringBuilder();
        for (Integer item : resList) {
            sb.append(item);
        }
        return Integer.parseInt(sb.toString());
    }

    private ListNode numToListNode(int num){
        String[] numItems = String.valueOf(num).split("");
        ListNode node = null;
        for (String numItem : numItems) {
            int n = Integer.parseInt(numItem);
            if (Objects.isNull(node)) {
                node = new ListNode(n, null);
            }else {
                node = new ListNode(n, node);
            }
        }
        return node;
    }



    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }


}
