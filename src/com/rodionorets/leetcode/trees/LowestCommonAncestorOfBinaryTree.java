package com.rodionorets.leetcode.trees;

public class LowestCommonAncestorOfBinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode lcaOnLeft = lowestCommonAncestor(root.left, p, q);
        TreeNode lcaOnRight = lowestCommonAncestor(root.right, p, q);

        if (lcaOnLeft != null && lcaOnRight != null) {
            return root;
        }

        if (lcaOnLeft != null) return lcaOnLeft;
        if (lcaOnRight != null) return lcaOnRight;

        return null;
    }

}
