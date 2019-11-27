package com.algorithm.leetcode.tree;

import java.util.*;

public class JudgeSearchTree {
    static int index = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line= scanner.nextLine();
        if (line.contains("None")){
            System.out.println("False");
            return;
        }
        if (line.equals("") || !line.contains(",")){
            System.out.println("True");
            return;
        }
        String [] treeNodes = line.split(",");
        if (treeNodes.length >= 10000){
            return;
        }
        if (treeNodes.length == 0 || treeNodes.length == 1){
            System.out.println("True");
            return;
        }
        int[] ints = Arrays.stream(treeNodes).mapToInt(s -> Integer.valueOf(s)).toArray();
        Arrays.sort(ints);
        TreeNode resultTree = getTree(ints, 0, ints.length-1);
        int []result = treeToArray(resultTree, ints.length-1);
        for (int i = 0; i< result.length-1; i++){
            if (ints[i] != result[i]){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }


    public static TreeNode getTree(int[] nums,int left,int right){
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
    public static int[] treeToArray(TreeNode pTreeRoot, int length){ //非递归版本
        ArrayList<Integer> list = new ArrayList<>();
        if(pTreeRoot == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pTreeRoot);
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(treeNode.left!=null){
                queue.offer(treeNode.left);
            }
            if(treeNode.right!=null){
                queue.offer(treeNode.right);
            }
            list.add(treeNode.val);
        }
        return list.stream().mapToInt(s->Integer.valueOf(s)).toArray();
    }
}
