package com.rodionorets.leetcode;

public class SumOfLeftLeaves {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) { return 0; }

        if (root.left == null && root.right == null) { return root.val; }

        if (root.right == null) {
            return sumOfLeftLeaves(root.left);
        }

        if (root.right.left != null || root.right.right != null) {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left);
        }
    }
}
