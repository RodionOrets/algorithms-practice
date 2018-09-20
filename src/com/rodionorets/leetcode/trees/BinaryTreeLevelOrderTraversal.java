package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();

        Queue<TreeNode> nodes = new LinkedList<>();

        if (root != null) nodes.offer(root);

        while (!nodes.isEmpty()) {
            int levelNodesCount = nodes.size();
            List<Integer> levelValues = new ArrayList<>();
            for (int i = 0; i < levelNodesCount; i++) {
                TreeNode node = nodes.poll();
                levelValues.add(node.val);
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
            }
            levelOrder.add(levelValues);
        }

        return levelOrder;
    }
}
