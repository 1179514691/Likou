package com.yang.tree;

public class Solution2 {

    //定义一个变量
    boolean result = true;


    public boolean isBalanced(TreeNode root) {

        getDept(root,0);
        return result;

    }

    private int getDept(TreeNode root, int dept) {

        //如果为空返回深度
        if (root == null) {
            return dept;
        }

        //获取左边的深度, 深度+1
        int leftDept = getDept(root.left, dept + 1);
        //获取右边的深度, 深度+1
        int rightDept = getDept(root.right, dept + 1);

        //判断左右深度是否大于1
        if (Math.abs(leftDept - rightDept) > 1) {
            result = false;
        }

        //返回最大值的深度
        return Math.max(leftDept, rightDept);
    }
}
