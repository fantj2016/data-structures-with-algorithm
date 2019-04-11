package com.gogostudy.leetcode.linklist;

/**
 * Created by Fant.J.
 * 2018/8/20 20:02
 */
public class 合并两个有序链表 {

    public static void main(String[] args) {
       /* 输入：1->2->4, 1->3->4
        输出：1->1->2->3->4->4*/
       Solution solution = new Solution();
       ListNode listNode = new ListNode(1);
       listNode.next = new ListNode(1);
       listNode.next.next = new ListNode(2);
        ListNode listNode1 = solution.mergeTwoLists(listNode, listNode);
        while (listNode1 != null){
            System.out.println(listNode1.val+"->");
            listNode1 = listNode1.next;
        }
    }

    static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
    static class Solution {
        public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
            ListNode listNode = new ListNode(0);
            /**
             * 为什么要复制一个链表，因为listNode会因为.next失去指针焦点
             */
            ListNode initNode = listNode;
            /**
             * 如果l1和l2都不为空，则一直循环取值比较
             */
            while (l1 != null && l2!=null){
                //如果l1比l2小，将l1赋值给listNode的下一个节点，l1指针下移
                if (l1.val<=l2.val){
                    listNode.next = l1;
                    l1 = l1.next;
                }else {
                    listNode.next = l2;
                    l2 = l2.next;
                }
                listNode = listNode.next;
            }
            /**
             * 如果一个链表空了，则将另一个链表复制到listNode尾
             */
            while (l1 == null && l2!=null){
                listNode.next = l2;
                l2 = l2.next;
                listNode = listNode.next;
            }
            while (l1 != null && l2 == null){
                listNode.next = l1;
                l1 = l1.next;
                listNode = listNode.next;
            }
            /**
             * 此时的链表listNode指针指向最后一位，但是我们需要返回整条链
             */
            return initNode.next;
        }
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode listNode = null;
            /**
             * 如果l1是空，则直接把 l2 返回
             */
            if (l1 == null){
                return l2;
            }
            if (l2 == null){
                return l1;
            }
            if (l1.val < l2.val){
                listNode = l1;
                listNode.next = mergeTwoLists(l1.next,l2);
            }else {
                listNode = l2;
                listNode.next = mergeTwoLists(l1,l2.next);
            }
            return listNode;
        }
    }


}
