package com.rodionorets.leetcode.trees;

public class MaximumDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

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
