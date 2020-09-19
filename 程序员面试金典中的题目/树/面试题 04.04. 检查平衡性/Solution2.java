package com.yang.tree;

public class Solution2 {

    //����һ������
    boolean result = true;


    public boolean isBalanced(TreeNode root) {

        getDept(root,0);
        return result;

    }

    private int getDept(TreeNode root, int dept) {

        //���Ϊ�շ������
        if (root == null) {
            return dept;
        }

        //��ȡ��ߵ����, ���+1
        int leftDept = getDept(root.left, dept + 1);
        //��ȡ�ұߵ����, ���+1
        int rightDept = getDept(root.right, dept + 1);

        //�ж���������Ƿ����1
        if (Math.abs(leftDept - rightDept) > 1) {
            result = false;
        }

        //�������ֵ�����
        return Math.max(leftDept, rightDept);
    }
}
