package com.gogostudy.leetcode.linklist;

/**
 * Created by Fant.J.
 * 2018/8/24 10:53
 */
public class 删除排序链表中的重复元素 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            while (current != null && current.next != null){
                //如果当前val和下一节点的val相等，则将该节点的next指向下下节点,
                //否则的话，将当前指针往后移
                if (current.val == current.next.val){
                    current.next = current.next.next;
                }else {
                    current = current.next;
                }
            }
            return head;
        }
    }
}
