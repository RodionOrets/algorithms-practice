package com.rodionorets.leetcode.trees;

/*
 * Given a binary tree root.
 * A node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 * Return the number of good nodes in the binary tree.
 */

public class GoodNodesInBinarySearchTree {

    public int goodNodes(TreeNode root) {
        return goodNodes(root, Integer.MIN_VALUE);
    }

    private int goodNodes(TreeNode root, int maxSoFar) {
        if (root == null) return 0;

        int goodNodeCount = root.val >= maxSoFar ? 1 : 0;

        goodNodeCount += goodNodes(root.left, Math.max(root.val, maxSoFar));
        goodNodeCount += goodNodes(root.right, Math.max(root.val, maxSoFar));

        return goodNodeCount;
    }

}
