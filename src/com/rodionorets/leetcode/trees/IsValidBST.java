package com.rodionorets.leetcode.trees;

public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long minAllowedValue, long maxAllowedValue) {
        if (root == null) return true;

        return root.val > minAllowedValue
                && root.val < maxAllowedValue
                && isValidBST(root.left, minAllowedValue, root.val)
                && isValidBST(root.right, root.val, maxAllowedValue);
    }

}
