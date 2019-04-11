package com.gogostudy.offer;

public class 二叉搜索树与双向链表 {
    private TreeNode currentNode;
    private TreeNode resultHead;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null){
            return null;
        }
        Convert(pRootOfTree.left); //左

        if(currentNode == null){ //根
            currentNode = pRootOfTree;
            resultHead= pRootOfTree;
        }else{
            currentNode.right= pRootOfTree;
            pRootOfTree.left= currentNode ;
            currentNode = pRootOfTree;
        }

        Convert(pRootOfTree.right); //右
        return resultHead;
    }

    public static void main(String[] args) {
        二叉搜索树与双向链表 main = new 二叉搜索树与双向链表();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;
        TreeNode convert = main.Convert(treeNode2);
        System.out.println(convert.val);
    }

}
