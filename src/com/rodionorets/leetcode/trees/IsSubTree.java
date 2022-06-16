package com.rodionorets.leetcode.trees;

public class IsSubTree {

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return subRoot == null;

        return isSameTree(root, subRoot)
                || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    private static boolean isSameTree(TreeNode one, TreeNode another) {
        if (one == null && another == null) return true;
        if (one == null || another == null) return false;

        return one.val == another.val
                && isSameTree(one.left, another.left)
                && isSameTree(one.right, another.right);
    }

}
