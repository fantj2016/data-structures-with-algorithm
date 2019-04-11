package com.gogostudy.leetcode.tree;

/**
 * Created by Fant.J.
 * 2018/8/26 22:26
 */
public class 相同的树 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            /**
             * 判断两树是否为空
             */
            if (p != null && q!= null){
                if (p.val != q.val){
                    return false;
                }else {
                    return isSameTree(p.right,q.right)&&isSameTree(p.left,q.left);
                }
            }else {
                if (p == null && q==null){
                    return true;
                }else {
                    return false;
                }
            }
        }
    }
}
