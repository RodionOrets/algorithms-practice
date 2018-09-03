package com.rodionorets.leetcode.trees;

public class MaximumDepthOfNaryTree {
    public int maxDepth(NaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxDepth = 0;

        for(int i = 0; i < root.children.size(); i++) {
            maxDepth = Math.max(maxDepth, maxDepth(root.children.get(i)));
        }

        return 1 + maxDepth;
    }
}
