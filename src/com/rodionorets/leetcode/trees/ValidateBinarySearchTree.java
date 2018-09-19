package com.rodionorets.leetcode.trees;

public class ValidateBinarySearchTree {
    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        return isKeysInRange(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isKeysInRange(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        } else if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }

        boolean leftKeysInRange = isKeysInRange(root.left, minValue, root.val);
        boolean rightKeysInRange = isKeysInRange(root.right, root.val, maxValue);

        return leftKeysInRange && rightKeysInRange;
    }
}
