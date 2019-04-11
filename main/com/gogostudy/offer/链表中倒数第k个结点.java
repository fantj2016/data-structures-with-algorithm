package com.gogostudy.offer;

public class 链表中倒数第k个结点 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode listNode = node;
        for (int i = 2; i<6; i++){
            listNode.next = new ListNode(i);
            listNode = listNode.next;
        }
        FindKthToTail(node,5);
    }
    public static ListNode FindKthToTail(ListNode head, int k) {
        // 倒数第k个就是正数第 length-k+1 个
        if (head == null || k < 0){
            return null;
        }
        ListNode prototype = head;
        int length = 1;
        while (prototype.next != null){
            prototype = prototype.next;
            ++length;
        }
        if (length < k){
            return null;
        }
        // 遍历到 length-k ，不需要加1
        for (int i = 0; i< length-k; i++){
            head = head.next;
        }
        return head;
    }
}
