package com.algorithm.offer;

public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
        TreeNode temp = null;
        if (root != null){
            // 交换左右 子节点
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            //交换完成后需要判断 其左右子树 是否是空， 如果不是空 需要遍历交换
            if (root.left != null){
                Mirror(root.left);
            }
            if (root.right != null){
                Mirror(root.right);
            }
        }

    }
}
