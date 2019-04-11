package com.algorithm.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Fant.J.
 * 2018/8/28 9:44
 */
public class 二叉树的层次遍历II {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node = node.right;
        node.left = new TreeNode(15);
        node.right = new TreeNode(7);
        List<List<Integer>> lists = solution.levelOrderBottom(node);
        lists.forEach(System.out::println);
    }
}


class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<>();
        if (root == null) {
            return ret;
        }
        // 直接插入在头部，或者最后翻转链表
        levelOrderCore(root, ret);
        return ret;

    }
    //时间复杂度：O(n)
    //空间复杂度：O(n)
    public void levelOrderCore(TreeNode root, List<List<Integer>> ret) {
        int nextCount = 0;
        int curCount = 1;
        // 队列，层次遍历
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        //临时存放 节点
        List<Integer> tmp = new LinkedList<>();
        //如果 treeNOde队列不为空，则pop值然后添加到list
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            tmp.add(node.val);
            //当前元素数-1
            curCount--;
            //如果pop的元素有左子节点，则加入到treeNode队列
            if (node.left != null) {
                q.offer(node.left);
                // 当前元素值 +1
                nextCount++;
            }
            //如果pop的元素有右子节点，则加入到treeNode队列
            if (node.right != null) {
                q.offer(node.right);
                // 当前元素值 +1
                nextCount++;
            }
            if (curCount == 0) {
                // 当前元素值= nextCount
                curCount = nextCount;
                nextCount = 0;
                // 把结点添加到头部，使用双向链表LinkedList
                ret.add(0, new LinkedList<>(tmp));
                tmp.clear();
            }
        }
    }
}
