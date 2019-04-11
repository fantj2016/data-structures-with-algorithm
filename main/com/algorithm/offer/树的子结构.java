package com.algorithm.offer;

public class 树的子结构 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result  = false;
        if (root1 == null || root2 == null){
            return false;
        }
        if (root1.val == root2.val){
            //判断是否有 子树关系
           result = isSubTree(root1, root2);
        }
        if (!result){
            HasSubtree(root1.left, root2);
        }
        if (!result){
            HasSubtree(root1.right, root2);
        }
        return result;
    }
    public boolean isSubTree(TreeNode node1,TreeNode node2){
        // 如果node2为空，说明node2 已经为空
        if (node2 == null){
            return true;
        }
        // 如果node2 不为空， node1 为空，则没有子树
        if (node1 == null){
            return false;
        }
        if (node1.val != node2.val){
            return false;
        }
        return isSubTree(node1.left, node2.left)&&isSubTree(node1.right, node2.right);
    }
}
