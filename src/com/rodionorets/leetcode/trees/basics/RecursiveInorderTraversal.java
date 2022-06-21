package com.rodionorets.leetcode.trees.basics;

import java.util.ArrayList;
import java.util.List;

import com.rodionorets.leetcode.trees.TreeNode;

public class RecursiveInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal(root, new ArrayList<Integer>());
    }
    
    private List<Integer> inorderTraversal(TreeNode root, List<Integer> traversal) {
        if (root == null) return traversal;
        
        inorderTraversal(root.left, traversal);
        traversal.add(root.val);
        inorderTraversal(root.right, traversal);
        
        return traversal;
    }
}
