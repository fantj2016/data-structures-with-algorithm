package com.gogostudy.leetcode.tree;

/**
 * Created by Fant.J.
 * 2018/9/12 10:32
 */
public class 平衡二叉树 {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null){
                return true;
            }
            //判断当前节点的  左支最大深度 和 右支最大深度
            if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1){
                return false;
            }
            //遍历调用每一个节点
            return isBalanced(root.left) && isBalanced(root.right);
        }

        /**
         * 计算节点的最大深度
         */
        public int maxDepth(TreeNode root) {
            if (root == null){
                return 0;
            }
            int a = maxDepth(root.left)+1;
            int b = maxDepth(root.right)+1;
            return a>b?a:b;
        }
    }
}
