package com.rodionorets.leetcode.trees.basics;

import java.util.ArrayList;
import java.util.List;

import com.rodionorets.leetcode.trees.TreeNode;

public class RecursivePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));

        return list;
    }
}
