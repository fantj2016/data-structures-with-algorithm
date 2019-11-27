package com.algorithm.leetcode.tree;

/**
 * Created by Fant.J.
 */
public class 将有序数组转换为二叉搜索树 {
    public static void main(String[] args) {

    }
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null){
                return null;
            }
            return getTree(nums,0,nums.length-1);
        }
        public  TreeNode getTree(int[] nums,int left,int right){
            if (left<=right){
                //寻找中间节点
                int mid = (left+right)/2;
                //赋值中间节点
                TreeNode treeNode = new TreeNode(nums[mid]);
                treeNode.left = getTree(nums,left,mid-1);
                treeNode.right = getTree(nums,mid+1,right);
                return treeNode;
            }else {
                return null;
            }
        }
    }
}
