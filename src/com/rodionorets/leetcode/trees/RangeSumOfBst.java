package com.rodionorets.leetcode.trees;

public class RangeSumOfBst {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        int rangeSum = inRange(root.val, L, R) ? root.val : 0;
        if (root.val >= L) rangeSum += rangeSumBST(root.left, L, R);
        if (root.val <= R) rangeSum += rangeSumBST(root.right, L, R);
        return rangeSum;
    }

    private boolean inRange(int value, int down, int top) {
        return value >= down && value <= top;
    }
}
