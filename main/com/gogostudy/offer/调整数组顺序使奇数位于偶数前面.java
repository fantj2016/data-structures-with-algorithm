package com.gogostudy.offer;

public class 调整数组顺序使奇数位于偶数前面 {
    public static void main(String[] args) {
        reOrderArray(new int[]{1,2,3,4,5,6,7});
    }
    public static void reOrderArray(int[] array) {
        // 复制一个数组出来，并对原数组进行覆盖
        int [] prototype = array.clone();
        int oddCount = 0;
        for (int i = 0 ;i< prototype.length; i++){
            if ((prototype[i] & 1 ) == 1){
                array[oddCount++] = prototype[i];
            }
        }
        for (int i = 0; i< prototype.length; i++){
            if ((prototype[i]&1) == 0){
                array[oddCount++] = prototype[i];
            }
        }
    }
}
