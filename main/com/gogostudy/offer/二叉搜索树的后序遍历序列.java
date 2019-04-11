package com.gogostudy.offer;

public class 二叉搜索树的后序遍历序列 {
    public boolean VerifySquenceOfBST(int [] sequence) {

        if (sequence.length == 0){
            return false;
        }
        if (sequence.length == 1){
            return true;
        }
        return ju(sequence, 0, sequence.length-1);
    }

    private boolean ju(int[] sequence, int start, int end) {
        if (start > end){
            return true;
        }
        int i = start;
        //遍历 找到 左右子树分界, 二叉搜索树：左子树<根<右子树
        // 找到符合条件的i , 则找到了左右子树分界， 数组段的最后一位依旧是根节点
        while (sequence[i]<sequence[end]){
            ++i;
        }
        for (int j = i; j< end; j++){
            // i 后面的值都是根结点的右子树， 如果右子树有值比根小(右子树应该都比根节点大)，则返回false
            if (sequence[j]<sequence[end]){
                return false;
            }
        }
        return ju(sequence, start, i-1)&&ju(sequence, i, end-1);
    }
}
