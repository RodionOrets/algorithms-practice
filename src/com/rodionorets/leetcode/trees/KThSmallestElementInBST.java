package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class KThSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> inorderTraversal = traverse(root);
        TreeNode kThSmallestNode = inorderTraversal.get(k - 1);
        return kThSmallestNode.val;
    }

    private List<TreeNode> traverse(TreeNode node) {
        return traverse(node, new ArrayList<>());
    }

    private List<TreeNode> traverse(TreeNode node, List<TreeNode> traverse) {
        if (node == null) return traverse;
        traverse(node.left, traverse);
        traverse.add(node);
        traverse(node.right, traverse);
        return traverse;
    }

}
