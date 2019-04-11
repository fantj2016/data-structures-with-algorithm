package com.gogostudy.offer;


import java.util.ArrayList;

public class 顺时针打印矩阵 {
    public ArrayList<Integer> printMatrix(int [][] array) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(array.length==0) return result;
        int n = array.length,m = array[0].length;
        if(m==0) return result;
        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
        for(int i=0;i<layers;i++){
            //左至右遍历， m-i 表示列的终点
            for(int k = i;k<m-i;k++) result.add(array[i][k]);
            // 右上至右下, 从(i+1)行开始， 列号不变，都是m-i-1
            for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);
            //右至左, 行号不变 n-i-1 , 列号从 m-i-2 处 --， 并且不能顶到头
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);
            //左下至左上, 列号不变 i, 行号从 n-i-2 开始--, 别且不能顶到头
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);
        }
        return result;
    }
}
