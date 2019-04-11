package com.algorithm.leetcode.tree;

/**
 * Created by Fant.J.
 * 2018/9/12 11:28
 */
public class 路径总和 {
    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {

            if (root == null){
                return false;
            }
            if (root.left == null && root.right ==null && root.val == sum){
                return true;
            }
            return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
        }
    }
}
