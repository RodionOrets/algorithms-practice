package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BinaryTreeInorderTraversal {

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
