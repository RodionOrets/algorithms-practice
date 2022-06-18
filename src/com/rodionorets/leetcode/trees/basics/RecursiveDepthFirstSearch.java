package com.rodionorets.leetcode.trees.basics;

import com.rodionorets.leetcode.trees.TreeNode;

public class RecursiveDepthFirstSearch {

    public TreeNode dfs(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        if (root.val == target) {
            return root;
        }

        TreeNode left = dfs(root.left, target);

        return left != null
                ? left
                : dfs(root.right, target);
    }

}
