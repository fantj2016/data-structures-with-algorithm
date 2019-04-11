package com.gogostudy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class 强整数 {
    public static void main(String[] args) {
        System.out.println(new Solution().powerfulIntegers(1, 1,2));
    }
    static class Solution {
        public List<Integer> powerfulIntegers(int x, int y, int bound) {
            List<Integer> list = new ArrayList<>();
            if (x==1 && y ==1){
                if (bound <2){
                    return list;
                }else {
                    list.add(2);
                    return list;
                }
            }
            for (int i = 0; i< 100000; i++){
                if(Math.pow((x<y?x:y),i)>bound){
                    break;
                }
                for (int j = 0; j< 100000; j++){
                    int temp = (int) (Math.pow(x,i)+Math.pow(y,j));
                    if (temp <= bound && !list.contains(temp)){
                        list.add(temp);
                    }else if (temp > bound ){
                        break;
                    }
                }
            }
            return list;
        }
    }
}
