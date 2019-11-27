package com.algorithm.leetcode;

import java.util.*;

public class 和可被K整除的子数组 {
    Set<List<Integer>> set = new HashSet<>();
    public int subarraysDivByK(int[] A, int K) {
        boolean[] booleans = new boolean[A.length];
        find(A, 0, booleans);
        System.out.println(set);
        // 遍历set
        int count = 0;
        Iterator<List<Integer>> iterator = set.iterator();
        while (iterator.hasNext()){
            List<Integer> list= iterator.next();
            int temp = 0;
            for (int i = 0; i< list.size(); i++){
                temp += list.get(i);
            }
            if (temp % K == 0 && list.size()!=0){
                System.out.println("满足的temp"+temp+ "对应的list"+list);
                count++;
            }
        }
        return count/2;
    }
    void find(int[] arr, int position, boolean[] isIns) {
        if (position == arr.length) {
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < arr.length;i++) {
                if (isIns[i]) {
                    list.add(arr[i]);
                }
            }
            set.add(list);
        } else {
            isIns[position] = true;
            find(arr, position + 1, isIns);
            isIns[position] = false;
            find(arr, position + 1, isIns);
        }
    }
}
