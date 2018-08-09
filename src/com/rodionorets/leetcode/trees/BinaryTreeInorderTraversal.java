package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;

        list.addAll(inorderTraversalRecursive(root.left));
        list.add(root.val);
        list.addAll(inorderTraversalRecursive(root.right));

        return list;
    }

    public List<Integer> inorderTraversalIterative(TreeNode node) {
        List<Integer> list = new ArrayList<>();



        return list;
    }
}
