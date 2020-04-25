package com.company.easy;

import com.company.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : wangzhen
 * create at:  2020/4/25  12:19 下午
 * @description: 二叉树的所有路径
 */

public class QNumber257 {

    public static void main(String[] args) {
        TreeNode temp = new TreeNode(1);
        temp.left = new TreeNode(2);
        temp.right = new TreeNode(3);
        temp.left.right = new TreeNode(5);
        List<String> list =  binaryTreePaths(temp);
        System.out.println(list);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> results = new ArrayList<String>();
        if (root == null) return  results;
        GetPaths(root,"",results);
        return  results;
    }

    /**
     * 递归 先左子树 后右子树 当前树左右子树都为null 的时候为叶子节点
     * 每递归一次 将节点 cur 路径中增加节点
     * 因为不知道那一次递归中会遇到叶子节点，所以将result 一直带着
     *
     * @param root  跟节点
     * @param cur   路径
     * @param result    结果集
     */
    public static void GetPaths(TreeNode root , String cur , List<String> result){
        if (root == null)
            return;
        cur += root.val;
        if (root.left == null && root.right == null){
            result.add(cur);
        }else {
            GetPaths(root.left,cur+"->",result);
            GetPaths(root.right,cur+"->",result);
        }
    }

}
