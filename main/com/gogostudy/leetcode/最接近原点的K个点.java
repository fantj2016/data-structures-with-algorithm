package com.gogostudy.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class 最接近原点的K个点 {
    public int[][] kClosest(int[][] points, int K) {

        System.out.println("行"+points.length);
        System.out.println("列"+points[0].length);
        System.out.println("第一个坐标"+points[0][0]+points[0][1]);
        int row = points.length;
        List<Integer> list = new ArrayList();
        int [][] result = new int[K][2];
        for (int i = 0; i<row; i++){
            // 计算他们的平方和 ， 然后比较
            int temp= points[i][0] * points[i][0] + points[i][1] * points[i][1];
            list.add(temp);
        }

        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i< K; i++){
            // 拿到最小的结果
            Integer temp= collect.get(i);
            for (int j = 0; j < list.size(); j++){
                if (temp.equals(list.get(j))){
                    result[i][0] = points[j][0];
                    result[i][1] = points[j][1];
                }
            }

        }
        return result;
    }
}
