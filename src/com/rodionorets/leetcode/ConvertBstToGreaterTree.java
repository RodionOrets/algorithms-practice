package com.rodionorets.leetcode;

public class ConvertBstToGreaterTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int temp = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        convertBST(root.right);
        root.val += temp;
        temp = root.val;
        convertBST(root.left);

        return root;
    }
}
