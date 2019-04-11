package com.algorithm.offer;

import java.util.ArrayList;

public class 二叉树中和为某一值的路径 {
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        // 如果 二叉树是空， 则直接返回空
        if (root == null){
            return  listAll;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null){
            listAll.add(new ArrayList<>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        // 如果没有找到符合结果的路径， 则删除上一个add进去的 节点
        list.remove(list.size()-1);
        return listAll;
    }
}
