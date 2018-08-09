package com.rodionorets.leetcode.trees;

public class ConvertBstToGreaterTree {

    int temp = 0; // TODO (1): Remove global variable

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        convertBST(root.right);
        root.val += temp;
        temp = root.val;
        convertBST(root.left);

        return root;
    }
}
