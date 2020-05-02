package com.company.mid;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : wangzhen
 * create at:  2020/4/28  10:32 下午
 * @description: 第k个派列
 */
public class QNumber60 {

    public static void main(String[] args) {
        System.out.println(getPermutation(3, 1));
    }

    /**
     * @param n 1-9
     * @param k
     * @return
     */
    public static String getPermutation(int n, int k) {
        //首先判断 k 是否合法 但是题目 没有不合法输出。。。
        String result = "";
        //结果
        StringBuilder stringBuilder = new StringBuilder();
        //候选数字
        List<Integer> candidates = new ArrayList<>();
        //分母的阶乘数
        int[] factorials = new int[n + 1];
        factorials[0] = 1;
        int factorial = 1;
        //数据初始化
        for (int i = 1; i <= n; i++) {
            candidates.add(i);
            factorial *= i;
            factorials[i] = factorial;
        }
        //计算结果
        k--;
        for (int i = n - 1; i >= 0; i--) {
            int index = k / factorials[i];
            stringBuilder.append(candidates.remove(index));
            k -= index * factorials[i];
        }

        return stringBuilder.toString();
    }

}
