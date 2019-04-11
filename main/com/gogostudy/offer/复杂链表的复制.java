package com.gogostudy.offer;

public class 复杂链表的复制 {

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null){
            return null;
        }
        RandomListNode currentNode = pHead;
        //1、复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
        while (currentNode != null){
            // 如果 不为空， 则复制链表
            //1`. new 一个新节点
            RandomListNode newNode = new RandomListNode(currentNode.label);
            //2. 将新的节点插入到旧节点后面
            RandomListNode next= currentNode.next;
            currentNode.next = newNode;
            newNode.next = next;
            //3. 指向下一个节点，进入循环
            currentNode = next;
        }
        //2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
        currentNode = pHead;
        while (currentNode != null){
            //1. 如果 A的random节点指向C ， 则 A1的random节点应该指向C.next
            currentNode.next.random = currentNode.random==null?null:currentNode.random.next;
            //2. 遍历进行下一个
            currentNode = currentNode.next.next;
        }

        //3、拆分链表，将链表拆分为原链表和复制后的链表
        currentNode = pHead;
        // 克隆链表应该是 从原链表的.next节点开始
        RandomListNode pCloneHead = pHead.next;
        while(currentNode != null) {
            // 克隆节点是 当前节点的.next
            RandomListNode cloneNode = currentNode.next;
            // 同理， 当前节点的下一个节点=克隆节点的.next
            currentNode.next = cloneNode.next;
            // 给克隆节点赋值
            cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
            // 循环
            currentNode = currentNode.next;
        }
        return pCloneHead;
    }
}
