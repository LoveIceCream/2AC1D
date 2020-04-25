package com.company.easy;

/**
 * @author : wangzhen
 * create at:  2020/4/22  11:38 上午
 * @description: 258.各位相加
 */
public class QNumber258 {

    public static void main(String[] args) {
        System.out.println(addDigits(258));
    }

    public static int addDigits(int num) {
            int result = 0;
            while (num!=0){
                result += num%10;
                num = num/10;
            }
            if (result>=10){
                result = addDigits(result);
            }
        return  result;
    }

//    大神题解 略微增加内存消耗
//    public static int addDigits(int num) {
//        return (num-1)%9+1;
//    }


}
