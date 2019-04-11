package com.gogostudy.leetcode.tree;

/**
 * Created by Fant.J.
 * 2018/9/12 11:17
 */
public class 二叉树的最小深度 {
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null){
                return  0;
            }
            if (root.left== null && root.right==null){
                return 1;
            }
            int rightDeep = 99999;
            int leftDeep = 99999;
            if (root.right != null) {
                rightDeep = minDepth(root.right) + 1;
            }
            if (root.left != null) {
                leftDeep = minDepth(root.left) + 1;
            }
            return leftDeep>rightDeep?rightDeep:leftDeep;

        }
    }
}
