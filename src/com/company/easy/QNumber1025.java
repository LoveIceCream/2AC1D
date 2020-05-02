package com.company.easy;

/**
 * @author : wangzhen
 * create at:  2020/4/30  2:09 下午
 * @description: 除数博弈 动态规划
 */
public class QNumber1025 {
    public static void main(String[] args) {
        divisorGame(3);
    }

    public static boolean divisorGame(int N) {
        boolean[] dp = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && dp[i - j] == false) {
                    dp[i] = true;
                }
            }
        }
        return dp[N];
    }
}
