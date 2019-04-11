package com.algorithm.leetcode.tree;

public class 单值二叉树 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(7);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(2);
        System.out.println(new Solution().isUnivalTree(treeNode));;
    }
    static class Solution {
        public boolean isUnivalTree(TreeNode root) {
            if (root == null){
                return true;
            }
            //遍历二叉树
            int var = root.val;
            boolean left = handleLeft(root.left,var);
            boolean right = handleRight(root.right,var);
            if (left && right){
                return true;
            }else {
                return false;
            }

        }
        public boolean handleLeft(TreeNode node, int val){
            if (node == null){
                return true;
            }
            if (node.val == val){
                return handleLeft(node.left, val) && handleRight(node.right, val );
            }else {
                return false;
            }
        }
        public boolean handleRight(TreeNode node, int val){
            if (node == null){
                return true;
            }
            if (node.val == val){
                return handleLeft(node.left, val) && handleRight(node.right, val );
            }else {
                return false;
            }
        }

    }
}
