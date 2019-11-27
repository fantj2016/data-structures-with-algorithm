package com.algorithm.leetcode.tree;

/**
 * Created by Fant.J.
 * 2018/8/26 22:39
 */
public class 对称二叉树 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            /**
             * 将该树分成左右两半，然后遍历比较
             */
            if (root == null){ return true; }
            return isEqual(root.left,root.right);
        }
        public boolean isEqual(TreeNode leftBranch,TreeNode rightBranch){
            if (leftBranch == null&&rightBranch == null){
                return true;
            }
            if (leftBranch == null || rightBranch ==null){
                return false;
            }
            return leftBranch.val==rightBranch.val&&isEqual(leftBranch.left,rightBranch.right)
                    &&isEqual(leftBranch.right,rightBranch.left);
        }
    }
}
