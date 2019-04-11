package com.gogostudy.offer;

import java.util.ArrayList;

public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList arrayList = new ArrayList();
        ArrayList result= new ArrayList();
        if (listNode == null){
            return result;
        }
        arrayList.add(listNode.val);
        while (listNode.next != null){
            arrayList.add(listNode.next.val);
            listNode = listNode.next;
        }
        arrayList.forEach(s-> System.out.println(s));
        for (int i = arrayList.size()-1 ; i >= 0 ; i--){
            result.add(arrayList.get(i));
        }
        return result;
    }
}
