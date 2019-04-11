package com.gogostudy.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class 字符串的排列 {
    public ArrayList<String> Permutation(String str) {

        ArrayList<String> list = new ArrayList<String>();
        if(str!=null && str.length()>0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }
    private void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        if(i == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            Set<Character> charSet = new HashSet<Character>();
            for(int j=i;j<chars.length;++j){
                if(j==i || !charSet.contains(chars[j])){
                    charSet.add(chars[j]);
                    swap(chars,i,j);
                    PermutationHelper(chars,i+1,list);
                    swap(chars,j,i);
                }
            }
        }
    }

    private void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

    public static void main(String[] args) {
//        字符串的排列 main = new 字符串的排列();
//        ArrayList<String> abcd = main.Permutation("abcd");
//        System.out.println(abcd.toString());
//        int i = new Integer(5);
        Integer i  = 6;
        Integer j = 6;
        System.out.println(i==j);
    }
}
