package com.rodionorets.leetcode.trees;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = 1;

        int leftDepth = depth + maxDepth(root.left);
        int rightDepth = depth + maxDepth(root.right);

        return Math.max(leftDepth, rightDepth);
    }
}
