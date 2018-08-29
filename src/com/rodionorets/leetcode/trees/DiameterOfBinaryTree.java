package com.rodionorets.leetcode.trees;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int currentDepth = depthOfBinaryTree(root.left) + depthOfBinaryTree(root.right);

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(currentDepth, Math.max(leftDiameter, rightDiameter));
    }

    private int depthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(depthOfBinaryTree(root.left), depthOfBinaryTree(root.right));
    }
}
