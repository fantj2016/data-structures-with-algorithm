package com.algorithm.offer;

import java.util.ArrayList;

public class 从上往下打印二叉树 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> nodes = new ArrayList<>();

        if (root == null){
            return list;
        }
        nodes.add(root);
        // 如果nodes 有值， 则遍历并添加所有 左右字节点， 然后list 存放nodes的第一个节点
        while (nodes.size() != 0){
            TreeNode temp = nodes.remove(0);
            if (temp.left != null){
                nodes.add(temp.left);
            }
            if (temp.right != null){
                nodes.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
