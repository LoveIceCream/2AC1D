package com.company.easy;

/**
 * @author : wangzhen
 * create at:  2020/4/30  5:12 下午
 * @description: 爬楼梯 动态规划
 */
public class QNumber70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(66));
    }

    public static int climbStairs(int n){
        if (n==1)return 1;
        if (n==2)return 2;

        int[] dp = new int[n+1];    //定义dp备忘录
        dp[1] = 1;                  //初始化
        dp[2] = 2;

        System.out.println("dp[1]=="+dp[1]);
        System.out.println("dp[2]=="+dp[2]);

        for (int i =3 ;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];

            System.out.println("dp["+i+"]=="+dp[i]);
        }
        return dp[n];
    }
}

/**
 输入： 1
 输出： 1
 解释： 有一种方法可以爬到楼顶。
 1.  1 阶

 输入： 2
 输出： 2
 解释： 有两种方法可以爬到楼顶。
 1.  1 阶 + 1 阶
 2.  2 阶

 输入： 3
 输出： 3
 解释： 有三种方法可以爬到楼顶。
 1.  1 阶 + 1 阶 + 1 阶
 2.  1 阶 + 2 阶
 3.  2 阶 + 1 阶

 输入： 4（3+1）（2+2）
 输出： 5
 解释： 有三种方法可以爬到楼顶。
 1.  1 阶 + 1 阶 + 1 阶 + 1 阶
 2.  1 阶 + 1 阶 + 2 阶
 3.  1 阶 + 2 阶 + 1 阶
 4.  2 阶 + 1 阶 + 1 阶
 5.  2 阶 + 2 阶
 */
