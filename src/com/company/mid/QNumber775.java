package com.company.mid;

/**
 * @author : wangzhen
 * create at:  2020/4/25  1:53 下午
 * @description: LeetCode 775 全局倒置与局部倒置
 * 解答过程中 读错题了，没有找规律 第一遍直接遍历整个数组求解了
 */
public class QNumber775 {
    public static void main(String[] args) {

        int[] A = {2,1,0};
        System.out.println(isIdealPermutation(A));
    }

    /**
     * 全局倒置是指 当前下标数值 比 所有的后边的数值都大 好像不是。。。好像是后边有一个 全局倒置数量加一
     * 局部倒置是指 当前下标数值 比 后一位的数值 大
     * <p>
     * 符合全局倒置一定符合局部倒置
     * 符合局部倒置不一定符合全局倒置
     */

    //这个函数 读题 读错了
    public static boolean isIdealPermutation_error(int[] A) {
        if (A.length<=2)return true;
        int GlobleNumber = 0;
        int PartNumber = 0;
        //int flag = 0;   //标记是否符合全局倒置 符合为0 不符合为1
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; i < A.length-1 && j<A.length; j++) {

                System.out.println("i=="+i+";j="+j);
                if (A[i] > A[j]) {
                    GlobleNumber++;
                    //符合倒置规则
                    if (j == i + 1) {
                        PartNumber++;
                    }
                }
            }
            //if (flag == 0) GlobleNumber++;
            //flag = 0;
        }
        System.out.println("GlobleNumber="+GlobleNumber);
        System.out.println("PartNumber="+PartNumber);
        if (GlobleNumber == PartNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isIdealPermutation(int[] A){
        for (int i = 0 ;i<A.length;i++){
            if (A[i]>i && A[i]-i>1){
                return  false;
            }
            if (A[i]<i && i-A[i]>1){
                return  false;
            }
        }
        return  true;
    }
}
