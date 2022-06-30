package com.rodionorets.leetcode.trees.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.rodionorets.leetcode.trees.TreeNode;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderTraversal = new ArrayList<>();

        if (root == null) return levelOrderTraversal;

        Queue<TreeNode> nodesToTraverse = new LinkedList<>();

        nodesToTraverse.offer(root);

        while (!nodesToTraverse.isEmpty()) {
            int levelBreadth = nodesToTraverse.size();
            List<Integer> currentLevelNodeValues = new ArrayList<>();
            for (int i = 0; i < levelBreadth; i++) {
                TreeNode node = nodesToTraverse.poll();
                if (node != null) {
                    currentLevelNodeValues.add(node.val);
                    if (node.left != null) nodesToTraverse.offer(node.left);
                    if (node.right != null) nodesToTraverse.offer(node.right);
                }
            }
            levelOrderTraversal.add(currentLevelNodeValues);
        }

        return levelOrderTraversal;
    }

}
