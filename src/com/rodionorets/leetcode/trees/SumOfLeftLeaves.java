package com.rodionorets.leetcode.trees;

public class SumOfLeftLeaves {

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
