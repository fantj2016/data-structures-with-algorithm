package com.algorithm.leetcode.tree;

/**
 * Created by Fant.J.
 * 2018/8/27 22:31
 */
public class 二叉树的最大深度 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    class Solution {
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
